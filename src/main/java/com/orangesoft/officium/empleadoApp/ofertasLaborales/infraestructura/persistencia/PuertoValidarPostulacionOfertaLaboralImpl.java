package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaOfertaLaboralEmpleado;
import com.orangesoft.officium.comun.generics.TuplaPersistenciaEmpresaOferta;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.mapeadores.MapeadorPersistenciaEmpleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.persistencia.entidades.PersistenciaEmpleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.repositorios.RepositorioEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoValidarPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetallesOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PuertoValidarPostulacionOfertaLaboralImpl implements PuertoValidarPostulacionOfertaLaboral {
    @Autowired
    private final RepositorioDetallesOfertaLaboral repositorioDetallesOfertaLaboral;
    @Autowired
    private final RepositorioEmpleado repositorioEmpleado;
    @Autowired
    private final MapeadorPersistenciaAOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaEmpleado mapeadorPersistenciaEmpleado;

    @Override
    public Tupla<OfertaLaboral, Empleado> validarPostulacionOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral) {
        Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboral = repositorioDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(UUID.fromString(idOfertaLaboral.getIdOfertaLaboral()));
        if(ofertaLaboral == null)
            return null;
        PersistenciaEmpleado persistenciaEmpleado = repositorioEmpleado.buscarEmpleadoActivosPorId(UUID.fromString(idEmpleado.getIdEmpleado()));
        return new TuplaOfertaLaboralEmpleado(mapeadorPersistenciaAOfertaLaboral.PersistenciaAOfertaLaboral(ofertaLaboral.getSecondElement()),
                mapeadorPersistenciaEmpleado.mapPersistenciaAEmpleado(persistenciaEmpleado));
    }
}