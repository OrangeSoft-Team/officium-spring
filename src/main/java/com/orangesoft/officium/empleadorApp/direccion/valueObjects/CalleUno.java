package com.orangesoft.officium.empleadorApp.direccion.valueObjects;

import com.orangesoft.officium.empleadorApp.direccion.excepciones.ExcepcionCalleInvalida;
import com.orangesoft.officium.empleadorApp.direccion.excepciones.ExcepcionCalleUnoNoNull;

public class CalleUno {
    private final String calleUno;

    public CalleUno(String calleUno){
        if(calleUno==null || calleUno.isEmpty())
            throw new ExcepcionCalleUnoNoNull();
        if(calleUno.length()<2 || calleUno.length()>128)
            throw new ExcepcionCalleInvalida();
        this.calleUno=calleUno;
    }
}
