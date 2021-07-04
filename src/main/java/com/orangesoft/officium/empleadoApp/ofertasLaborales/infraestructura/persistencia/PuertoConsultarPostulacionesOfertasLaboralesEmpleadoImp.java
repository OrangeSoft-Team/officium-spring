package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.comun.generics.Tripleta;
import com.orangesoft.officium.comun.generics.TripletaEmpresaOfertaPostulacion;
import com.orangesoft.officium.comun.generics.TripletaPersistenciaEmpresaOfertaPostulacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.mapper.MapeadorPersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoConsultarPostulacionesOfertaLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioPostulacionesOfertaLaborales;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoConsultarPostulacionesOfertasLaboralesEmpleadoImp implements PuertoConsultarPostulacionesOfertaLaboralesEmpleado {
    @Autowired
    private final RepositorioPostulacionesOfertaLaborales repositorioPostulacionesOfertaLaborales;
    @Autowired
    private final MapeadorPersistenciaAPostulacionOfertaLaboral mapeadorPersistenciaAPostulacionOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaAOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaEmpresa mapeadorPersistenciaEmpresa;

    @Override
    public List<TripletaEmpresaOfertaPostulacion> consultarPostulacionesOfertaLaboralEmpleado(IdEmpleado idEmpleado) {
        List<TripletaPersistenciaEmpresaOfertaPostulacion> persistenciaEmpresaOfertaPostulacionList =repositorioPostulacionesOfertaLaborales.obtenerPostulacionesOfertaLaboral(UUID.fromString(idEmpleado.getIdEmpleado()));
        List<TripletaEmpresaOfertaPostulacion> tripletaEmpresaOfertaPostulacions = new ArrayList<>();
        persistenciaEmpresaOfertaPostulacionList.forEach((e)->{
            tripletaEmpresaOfertaPostulacions.add(
                    new TripletaEmpresaOfertaPostulacion(
                            mapeadorPersistenciaEmpresa.PersistenciaAEmpresa(e.getFirstElement()),
                            mapeadorPersistenciaAOfertaLaboral.PersistenciaAOfertaLaboral(e.getSecondElement()),
                            mapeadorPersistenciaAPostulacionOfertaLaboral.mapPersistenciaAPostulacioOfertaLaboral(e.getThirdElement())
                    )
            ) ;
        });
        return tripletaEmpresaOfertaPostulacions;
    }
}
