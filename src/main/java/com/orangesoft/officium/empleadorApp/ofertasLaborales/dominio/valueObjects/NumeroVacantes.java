package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCantidadNumeroVacantesInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NumeroVacantes {
    private final int numeroVacantes;

    public NumeroVacantes(int numeroVacantes){
        if(numeroVacantes<0 || numeroVacantes>99)
            throw new ExcepcionCantidadNumeroVacantesInvalido();
        this.numeroVacantes=numeroVacantes;
    }
}
