package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

public class ExcepcionEstadoEmpresaNulo extends RuntimeException{
    public ExcepcionEstadoEmpresaNulo() {
        super("El estado de la empresa no puede ser nulo");
    }
}
