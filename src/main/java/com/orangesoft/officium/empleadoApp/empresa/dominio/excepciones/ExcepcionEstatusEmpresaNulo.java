package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionEstatusEmpresaNulo extends RuntimeException {
    public ExcepcionEstatusEmpresaNulo() {
        super("El estado de la empresa no puede se nulo");
    }
}
