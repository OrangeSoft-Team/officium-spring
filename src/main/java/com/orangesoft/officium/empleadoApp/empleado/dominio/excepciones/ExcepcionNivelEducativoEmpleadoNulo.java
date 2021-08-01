package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionNivelEducativoEmpleadoNulo extends RuntimeException {
    public ExcepcionNivelEducativoEmpleadoNulo() {
        super("El nivel educativo del empleado no puede ser nulo");
    }
}
