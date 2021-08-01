package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values;

import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionIdExperienciaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@EqualsAndHashCode
@Getter
public final class IdExperienciaLaboral {
    private final UUID uuid;

    public IdExperienciaLaboral(UUID uuid) {
        if(uuid == null)
            throw new ExcepcionIdExperienciaLaboralNulo();
        this.uuid = uuid;
    }
}
