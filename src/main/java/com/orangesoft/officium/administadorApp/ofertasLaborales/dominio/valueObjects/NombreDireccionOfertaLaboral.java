package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombreDireccionOfertaLaboral {
    private String calleUno;
    private String calleDos;

    public NombreDireccionOfertaLaboral(String calleUno, String calleDos) {
        if (calleUno == null || calleDos == null) {
            throw new ExcepcionCampoNulo("calle uno o calle dos de direcion");
        }
        this.calleUno = calleUno;
        this.calleDos = calleDos;
    }

    @Override
    public String toString() {
        return calleUno + " " + calleDos ;
    }
}
