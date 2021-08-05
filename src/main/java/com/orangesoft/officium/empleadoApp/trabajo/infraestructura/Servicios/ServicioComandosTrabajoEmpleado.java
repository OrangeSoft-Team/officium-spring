package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.Servicios;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.aplicacion.entrada.CasoDeUsoRenunciarTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ComandosTrabajo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ServicioComandosTrabajoEmpleado implements ComandosTrabajo {
    @Autowired
    private final CasoDeUsoRenunciarTrabajoEmpleado renunciarTrabajoEmpleado;

    @Override
    public void renunciarTrabajo(UUID idEmpleado, UUID idTrabajo) {
        renunciarTrabajoEmpleado.renunciarTrabajoEmpleado(new IdEmpleado(idEmpleado), new IdTrabajoEmpleado(idTrabajo));
    }
}
