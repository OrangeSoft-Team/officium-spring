package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values;

import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionCargoExperienciaLaboralNula;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class CargoExperienciaLaboral {
    private final String cargo;

    public CargoExperienciaLaboral(String cargo) {
        if(cargo == null || cargo.isEmpty())
            throw new ExcepcionCargoExperienciaLaboralNula();
        this.cargo = cargo;
    }
}
