package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionDireccionEmpleadoNula extends RuntimeException{
    public ExcepcionDireccionEmpleadoNula() {
        super("La direccion del empleado no puede ser nula o estar vacía");
    }
}
