package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionSueldoNulo;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTamanoCargoInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@EqualsAndHashCode
@Getter
public final class Cargo {
    private final String cargo;

    public Cargo(String cargo){
        if(cargo== null || cargo.isEmpty())
            throw new ExcepcionSueldoNulo();
        if (cargo.length()<4||cargo.length()>40)
            throw new ExcepcionTamanoCargoInvalido();
        this.cargo=cargo;

    }
}
