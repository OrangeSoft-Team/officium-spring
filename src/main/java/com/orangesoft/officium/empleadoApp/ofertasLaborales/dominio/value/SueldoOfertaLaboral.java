package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.moneda.dominio.Moneda;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionMonedaOfertaLaboralNula;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionSueldoOfertaLaboralInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class SueldoOfertaLaboral {
    private final float sueldo;
    private final Moneda moneda;

    public SueldoOfertaLaboral(float sueldo, Moneda moneda) {
        validarSueldo(sueldo);
        validarMoneda(moneda);
        this.sueldo = sueldo;
        this.moneda = moneda;
    }

    private void validarSueldo(float sueldo) {
        if(sueldo <= 0)
            throw new ExcepcionSueldoOfertaLaboralInvalido()  ;
    }

    private void validarMoneda(Moneda moneda) {
        if(moneda == null)
            throw new ExcepcionMonedaOfertaLaboralNula();
    }
}
