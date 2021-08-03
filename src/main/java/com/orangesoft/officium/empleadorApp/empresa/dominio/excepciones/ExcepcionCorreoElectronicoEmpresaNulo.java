package com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones;

public class ExcepcionCorreoElectronicoEmpresaNulo extends RuntimeException{
    public ExcepcionCorreoElectronicoEmpresaNulo(){
        super("no puede ser nulo");
    }
}
