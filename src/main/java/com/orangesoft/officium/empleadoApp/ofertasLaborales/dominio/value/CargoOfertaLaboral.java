package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionCargoOfertaLaboralNulo;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionLongitudCargoOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class CargoOfertaLaboral {
    private final String cargo;

    public CargoOfertaLaboral(String cargo) {
        validarCargoOfertaLaboral(cargo);
        this.cargo = cargo;
    }

    private void validarCargoOfertaLaboral(String cargo) {
        if(cargo == null)
            throw new ExcepcionCargoOfertaLaboralNulo();
        if(cargo.length() < 4 || cargo.length() > 40)
            throw new ExcepcionLongitudCargoOfertaLaboral();
    }
}
