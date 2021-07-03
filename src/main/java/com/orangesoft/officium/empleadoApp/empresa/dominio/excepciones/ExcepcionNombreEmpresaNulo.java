package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionNombreEmpresaNulo extends RuntimeException {
    public ExcepcionNombreEmpresaNulo() {
        super("El nombre de la empresa no puede ser nulo");
    }
}
