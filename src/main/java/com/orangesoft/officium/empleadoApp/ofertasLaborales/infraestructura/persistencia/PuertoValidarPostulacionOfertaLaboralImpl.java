package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaOfertaLaboralEmpleado;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.postulacionOfertaLaboral.PersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.trabajo.PersistenciaTrabajo;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioDireccion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.mapeadores.MapeadorPersistenciaEmpleado;
import com.orangesoft.officium.comun.persistencia.empleado.PersistenciaEmpleado;
import com.orangesoft.officium.empleadoApp.empleado.infraestructura.repositorios.RepositorioEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoValidarPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioPostulacionesOfertaLaborales;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.persistencia.repositorio.RepositorioTrabajoActivos;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoValidarPostulacionOfertaLaboralImpl implements PuertoValidarPostulacionOfertaLaboral {
    @Autowired
    private final RepositorioDetallesOfertaLaboral repositorioDetallesOfertaLaboral;
    @Autowired
    private final RepositorioEmpleado repositorioEmpleado;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaEmpleado mapeadorPersistenciaEmpleado;
    @Autowired
    private final RepositorioDireccion repositorioDireccion;
    @Autowired
    private final RepositorioPostulacionesOfertaLaborales postulacionesOfertaLaborales;
    @Autowired
    private final MapeadorPersistenciaPostulacionOfertaLaboral mapeadorPersistenciaPostulacionOfertaLaboral;
    @Autowired
    private final RepositorioTrabajoActivos repositorioTrabajoActivos;

    @Override
    public Tupla<OfertaLaboral, Empleado> validarPostulacionOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral) {
        Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboral = repositorioDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(idOfertaLaboral.getIdOfertaLaboral());
        if(ofertaLaboral == null)
            return null;
        PersistenciaEmpleado persistenciaEmpleado = repositorioEmpleado.buscarEmpleadoActivosPorId(idEmpleado.getIdEmpleado());
        return new TuplaOfertaLaboralEmpleado(mapeadorPersistenciaAOfertaLaboral.PersistenciaAOfertaLaboral(ofertaLaboral.getSecondElement()),
                mapeadorPersistenciaEmpleado.mapPersistenciaAEmpleado(persistenciaEmpleado, repositorioDireccion.buscarDireccionIdEmpleado(persistenciaEmpleado.getUuid())));
    }

    @Override
    public PostulacionOfertaLaboral validarSiYaSePostuloElEmpleado(IdEmpleado idEmpleado, IdOfertaLaboral idOfertaLaboral) {
        PersistenciaPostulacionOfertaLaboral persistenciaOfertaLaboral = postulacionesOfertaLaborales.obtenerPostulacionOfertaLaboral(idEmpleado.getIdEmpleado(), idOfertaLaboral.getIdOfertaLaboral());
        PersistenciaTrabajo persistenciaTrabajo = repositorioTrabajoActivos.obtenerTrabajosActivosEmpleado(idEmpleado.getIdEmpleado());
        if(persistenciaOfertaLaboral == null && persistenciaTrabajo == null)
            return null;
        return mapeadorPersistenciaPostulacionOfertaLaboral.PersistenciaAPostulacionOfertaLaboral(persistenciaOfertaLaboral);
    }

}
