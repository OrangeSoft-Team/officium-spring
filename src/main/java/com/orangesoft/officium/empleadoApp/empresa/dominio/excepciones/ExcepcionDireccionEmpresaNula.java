package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionDireccionEmpresaNula extends RuntimeException {
    public ExcepcionDireccionEmpresaNula() {
        super("La dirección de la empresa no puede ser nula");
    }
}
