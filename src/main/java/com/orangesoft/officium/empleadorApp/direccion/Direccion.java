package com.orangesoft.officium.empleadorApp.direccion;

import com.orangesoft.officium.empleadorApp.direccion.valueObjects.CalleDos;
import com.orangesoft.officium.empleadorApp.direccion.valueObjects.CalleUno;
import com.orangesoft.officium.empleadorApp.direccion.valueObjects.CodigoPostal;
import com.orangesoft.officium.empleadorApp.direccion.valueObjects.IdDireccion;

public class Direccion {
    private IdDireccion idDireccion;
    private CalleUno calleUno;
    private CalleDos calleDos;
    private CodigoPostal codigoPostal;

    public Direccion(IdDireccion idDireccion,
                     CalleUno calleUno,
                     CalleDos calleDos,
                     CodigoPostal codigoPostal){
        this.calleDos=calleDos;
        this.calleUno=calleUno;
        this.idDireccion=idDireccion;
        this.codigoPostal=codigoPostal;
    }

}
