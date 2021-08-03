package com.orangesoft.officium.empleadorApp.direccion.valueObjects;

import com.orangesoft.officium.empleadorApp.direccion.excepciones.ExcepcionCalleInvalida;

public class CalleDos {
    private final String calleDos;

    public CalleDos(String calleDos){
        if(calleDos.length()<2 || calleDos.length()>128)
            throw new ExcepcionCalleInvalida();
        this.calleDos=calleDos;
    }
}
