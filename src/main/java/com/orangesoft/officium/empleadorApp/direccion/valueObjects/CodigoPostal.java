package com.orangesoft.officium.empleadorApp.direccion.valueObjects;

import com.orangesoft.officium.empleadorApp.direccion.excepciones.ExcepcionCodigoPostalInvalido;
import com.orangesoft.officium.empleadorApp.direccion.excepciones.ExcepcionCodigoPostalNoNull;

public class CodigoPostal {
    private final String codigoPostal;
    public CodigoPostal(String codigoPostal){
        if(codigoPostal.isEmpty()||codigoPostal==null)
            throw new ExcepcionCodigoPostalNoNull();
        if(codigoPostal.length()<1 || codigoPostal.length()>10)
            throw new ExcepcionCodigoPostalInvalido();
        this.codigoPostal=codigoPostal;
    }
}
