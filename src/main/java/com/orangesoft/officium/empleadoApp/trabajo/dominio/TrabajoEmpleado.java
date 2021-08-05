package com.orangesoft.officium.empleadoApp.trabajo.dominio;

import com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones.ExcepcionDuracionTrabajoNulo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones.ExcepcionEstadoTrabajoNulo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones.ExcepcionIdentificadorTrabajoEmpleadoNulo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.DuracionTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.EstadoTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class TrabajoEmpleado {
    private IdTrabajoEmpleado identificadorTrabajoEmpleado;
    private DuracionTrabajo duracionTrabajo;
    private EstadoTrabajo estadoTrabajo;

    public TrabajoEmpleado(IdTrabajoEmpleado identificadorTrabajoEmpleado, DuracionTrabajo duracionTrabajo, EstadoTrabajo estadoTrabajo) {
        this.identificadorTrabajoEmpleado = identificadorTrabajoEmpleado;
        this.duracionTrabajo = duracionTrabajo;
        this.estadoTrabajo = estadoTrabajo;
        validarTrabajoEmpleado();
    }

    private void validarTrabajoEmpleado() {
        if(this.identificadorTrabajoEmpleado == null)
            throw new ExcepcionIdentificadorTrabajoEmpleadoNulo();
        if(this.duracionTrabajo == null)
            throw new ExcepcionDuracionTrabajoNulo();
        if(this.estadoTrabajo == null)
            throw new ExcepcionEstadoTrabajoNulo();
    }
}
