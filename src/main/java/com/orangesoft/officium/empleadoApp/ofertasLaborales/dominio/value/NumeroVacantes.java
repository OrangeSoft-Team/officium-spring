package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionNumeroVacantesInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NumeroVacantes {
    public NumeroVacantes(int numeroVacantes) {
        validarNumeroVacantes(numeroVacantes);
        this.numeroVacantes = numeroVacantes;
    }

    private final int numeroVacantes;

    private void validarNumeroVacantes(int numeroVacantes) {
        if(numeroVacantes < 1 || numeroVacantes > 99)
            throw new ExcepcionNumeroVacantesInvalido();
    }
}
