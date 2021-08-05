package com.orangesoft.officium.empleadoApp.ofertasLaborales.integracion;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.TrabajosMother;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryConsultaTrabajoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.QueryDetalleDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.Servicios.ServicioConsultasTrabajosEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.dto.TrabajosEmpleadoDTO;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores.MapeadorPersistenciaDTODetalleTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores.MapeadorPersistenciaDTODetalleTrabajoEmpleadoImpl;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores.MapeadorPersistenciaDTOTrabajosEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.mapeadores.MapeadorPersistenciaDTOTrabajosEmpleadoImpl;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.persistencia.repositorio.RepositorioTrabajoActivos;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestIntegracionCasoDeUsoConsultarTrabajos {

    @Mock
    RepositorioTrabajoActivos repositorioTrabajoActivos;

    @Test
    public void debeDevolverListaTrabajos() {
        TrabajosMother trabajosMother = new TrabajosMother();
        List<QueryConsultaTrabajoDTO> queryConsultaTrabajoDTOS = new ArrayList<>();
        queryConsultaTrabajoDTOS.add(trabajosMother.trabajosEmpleadosQuery());
        when(repositorioTrabajoActivos.obtenerTrabajosEmpleado(trabajosMother.trabajosEmpleadosQuery().getUuid())).thenReturn(queryConsultaTrabajoDTOS);

        MapeadorPersistenciaDTOTrabajosEmpleado mapeadorPersistenciaDTOTrabajosEmpleado = new MapeadorPersistenciaDTOTrabajosEmpleadoImpl();
        MapeadorPersistenciaDTODetalleTrabajoEmpleado mapeadorPersistenciaDTODetalleTrabajoEmpleado = new MapeadorPersistenciaDTODetalleTrabajoEmpleadoImpl();

        ServicioConsultasTrabajosEmpleado servicioConsultasTrabajosEmpleado = new ServicioConsultasTrabajosEmpleado(
                repositorioTrabajoActivos,
                mapeadorPersistenciaDTOTrabajosEmpleado,
                mapeadorPersistenciaDTODetalleTrabajoEmpleado
        );

        List<TrabajosEmpleadoDTO> trabajosEmpleadoDTOSObtenido = servicioConsultasTrabajosEmpleado.obtenerTrabajosEmpleado(trabajosMother.trabajosEmpleadosQuery().getUuid());
        TrabajosEmpleadoDTO trabajosEmpleadoDTODeseado = trabajosMother.obtenerDetalleTrabajoDTO();
        assert(trabajosEmpleadoDTOSObtenido.get(0).equals(trabajosEmpleadoDTODeseado));
    }
}
