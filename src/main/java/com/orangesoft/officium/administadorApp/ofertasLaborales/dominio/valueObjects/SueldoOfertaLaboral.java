package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionSueldoOfertaLaboralInvalido;

@EqualsAndHashCode
@Getter
public final class SueldoOfertaLaboral {
    private final Float sueldoOfertaLaboral;

    public SueldoOfertaLaboral(Float sueldoOfertaLaboral) {
        if(sueldoOfertaLaboral == null || sueldoOfertaLaboral < 0)
            throw new ExcepcionSueldoOfertaLaboralInvalido();

        this.sueldoOfertaLaboral = sueldoOfertaLaboral;
    }
}
