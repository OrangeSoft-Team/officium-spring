package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.comun.generics.TripletaEmpresaOfertaPostulacion;
import com.orangesoft.officium.comun.generics.TripletaPersistenciaEmpresaOfertaPostulacion;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPersistenciaDireccion;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioDireccion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.mapper.MapeadorPersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoConsultarPostulacionesOfertaLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioPostulacionesOfertaLaborales;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class PuertoConsultarPostulacionesOfertasLaboralesEmpleadoImp implements PuertoConsultarPostulacionesOfertaLaboralesEmpleado {
    @Autowired
    private final RepositorioPostulacionesOfertaLaborales repositorioPostulacionesOfertaLaborales;
    @Autowired
    private final MapeadorPersistenciaPostulacionOfertaLaboral mapeadorPersistenciaPostulacionOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboral mapeadorPersistenciaOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaEmpresa mapeadorPersistenciaEmpresa;
    @Autowired
    private final RepositorioDireccion repositorioDireccion;

    @Override
    public List<TripletaEmpresaOfertaPostulacion> consultarPostulacionesOfertaLaboralEmpleado(IdEmpleado idEmpleado) {
        List<TripletaPersistenciaEmpresaOfertaPostulacion> persistenciaEmpresaOfertaPostulacionList =repositorioPostulacionesOfertaLaborales.obtenerPostulacionesOfertaLaboral(idEmpleado.getIdEmpleado());
        List<TripletaEmpresaOfertaPostulacion> tripletaEmpresaOfertaPostulaciones = new ArrayList<>();
        persistenciaEmpresaOfertaPostulacionList.forEach((e)->{
            tripletaEmpresaOfertaPostulaciones.add(
                    new TripletaEmpresaOfertaPostulacion(
                            mapeadorPersistenciaEmpresa.PersistenciaAEmpresa(e.getFirstElement(), repositorioDireccion.buscarDireccionIdEmpresa(e.getFirstElement().getUuid())),
                            mapeadorPersistenciaOfertaLaboral.PersistenciaAOfertaLaboral(e.getSecondElement()),
                            mapeadorPersistenciaPostulacionOfertaLaboral.PersistenciaAPostulacionOfertaLaboral(e.getThirdElement())
                    )
            ) ;
        });
        return tripletaEmpresaOfertaPostulaciones;
    }
}
