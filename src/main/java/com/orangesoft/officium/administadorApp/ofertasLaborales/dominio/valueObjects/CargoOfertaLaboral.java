package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCargoOfertaLaboralNulo;

@EqualsAndHashCode
@Getter
public final class CargoOfertaLaboral {
    private final String cargoOfertaLaboral;

    public CargoOfertaLaboral(String cargoOfertaLaboral) {
        if(cargoOfertaLaboral == null || cargoOfertaLaboral.isEmpty())
            throw new ExcepcionCargoOfertaLaboralNulo();

        this.cargoOfertaLaboral = cargoOfertaLaboral;
    }
}
