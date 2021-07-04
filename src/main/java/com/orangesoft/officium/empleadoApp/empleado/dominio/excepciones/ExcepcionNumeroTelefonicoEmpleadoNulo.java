package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionNumeroTelefonicoEmpleadoNulo extends RuntimeException {
    public ExcepcionNumeroTelefonicoEmpleadoNulo() {
        super("El número de teléfono del empleado no puede ser nulo");
    }
}
