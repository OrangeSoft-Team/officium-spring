package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCantidadDecimalesSueldoInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class Sueldo {
    private final float sueldo;

    public Sueldo(float sueldo){

        if(sueldo< 0 ||sueldo > 1000000)
            throw new ExcepcionCantidadDecimalesSueldoInvalida();
        this.sueldo=sueldo;


    }
}
