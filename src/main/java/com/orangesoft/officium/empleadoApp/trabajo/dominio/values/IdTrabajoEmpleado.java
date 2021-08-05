package com.orangesoft.officium.empleadoApp.trabajo.dominio.values;

import com.orangesoft.officium.empleadoApp.trabajo.dominio.excepciones.ExcepcionIdentificadorTrabajoEmpleadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdTrabajoEmpleado {
    private final UUID uuid;

    public IdTrabajoEmpleado(UUID uuid) {
        if(uuid == null)
            throw new ExcepcionIdentificadorTrabajoEmpleadoNulo();
        this.uuid = uuid;
    }
}
