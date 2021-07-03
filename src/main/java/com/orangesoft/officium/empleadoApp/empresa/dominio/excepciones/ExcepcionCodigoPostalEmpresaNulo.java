package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionCodigoPostalEmpresaNulo extends RuntimeException {
    public ExcepcionCodigoPostalEmpresaNulo() {
        super("El codigo postal de la empresa no puede ser nulo");
    }
}
