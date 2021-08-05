package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.persistencia;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.aplicacion.salida.PuertoRenunciarTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.repositorio.RepositorioComandoTrabajosActivosEmpleados;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoRenunciarTrabajoEmpleadoImpl implements PuertoRenunciarTrabajoEmpleado {
    @Autowired
    RepositorioComandoTrabajosActivosEmpleados repositorioTrabajoActivos;

    @Override
    public void renunciarTrabajoEmpleado(IdTrabajoEmpleado idTrabajoEmpleado) {
        repositorioTrabajoActivos.renuciarTrabajoOferaLaboral(idTrabajoEmpleado.getUuid(), "CULMINADO");
    }

    public boolean lePerteneceOfertaLaboral(IdEmpleado idEmpleado, IdTrabajoEmpleado idTrabajoEmpleado) {
        return repositorioTrabajoActivos
                .verificarlePerteneceOfertaLaboral(idEmpleado.getIdEmpleado(), idTrabajoEmpleado.getUuid()) == null;
    }
}
