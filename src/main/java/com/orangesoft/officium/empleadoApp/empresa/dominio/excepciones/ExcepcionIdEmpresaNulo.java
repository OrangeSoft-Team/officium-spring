package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionIdEmpresaNulo extends RuntimeException {
    public ExcepcionIdEmpresaNulo() {
        super("El identificador de la empresa no puede ser nulo");
    }
}
