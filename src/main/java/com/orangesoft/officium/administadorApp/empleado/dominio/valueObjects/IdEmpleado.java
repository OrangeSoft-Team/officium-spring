package com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdEmpleado {
    private UUID uuid;

    public IdEmpleado(UUID uuid){
        if (uuid == null){
            throw new ExcepcionCampoNulo("uuid empleado");
        }
        this.uuid = uuid;
    }
}
