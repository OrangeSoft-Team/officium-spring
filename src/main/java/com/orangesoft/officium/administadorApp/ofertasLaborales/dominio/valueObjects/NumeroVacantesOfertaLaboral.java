package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionNumeroVacantesLaboralInvalido;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionNumeroVacantesOfertaLaboralNulo;

@EqualsAndHashCode
@Getter
public final class NumeroVacantesOfertaLaboral {
    private final Integer numeroVacantesOfertaLaboral;

    public NumeroVacantesOfertaLaboral(Integer numerovacantesOfertaLaboral) {
        if(numerovacantesOfertaLaboral == null)
            throw new ExcepcionNumeroVacantesOfertaLaboralNulo();
        if (numerovacantesOfertaLaboral <= 0)
            throw new ExcepcionNumeroVacantesLaboralInvalido();

        this.numeroVacantesOfertaLaboral = numerovacantesOfertaLaboral;
    }
}
