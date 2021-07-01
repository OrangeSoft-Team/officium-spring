package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionLongitudDireccionEmpresaInvalida extends RuntimeException {
    public ExcepcionLongitudDireccionEmpresaInvalida() {
        super("La logitud de la direccion de la empresa debe estar entre 4 y 256 caracteres");
    }
}
