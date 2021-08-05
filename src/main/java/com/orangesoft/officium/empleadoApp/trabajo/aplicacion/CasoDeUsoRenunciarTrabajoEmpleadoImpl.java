package com.orangesoft.officium.empleadoApp.trabajo.aplicacion;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.aplicacion.entrada.CasoDeUsoRenunciarTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.aplicacion.salida.PuertoRenunciarTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CasoDeUsoRenunciarTrabajoEmpleadoImpl implements CasoDeUsoRenunciarTrabajoEmpleado {
    @Autowired
    private final PuertoRenunciarTrabajoEmpleado puertoRenunciarTrabajoEmpleado;

    @Override
    public void renunciarTrabajoEmpleado(IdEmpleado idEmpleado, IdTrabajoEmpleado idTrabajoEmpleado) {
        if(puertoRenunciarTrabajoEmpleado.lePerteneceOfertaLaboral(idEmpleado, idTrabajoEmpleado))
            puertoRenunciarTrabajoEmpleado.renunciarTrabajoEmpleado(idTrabajoEmpleado);
        else
            throw new ExcepcionSolicitudDeRenunciaInvalida();
    }
}
