package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionActivoEmpleadoNulo extends RuntimeException{
    public ExcepcionActivoEmpleadoNulo() {
        super("El estatus de la cuenta del empleado no puede ser nulo");
    }
}
