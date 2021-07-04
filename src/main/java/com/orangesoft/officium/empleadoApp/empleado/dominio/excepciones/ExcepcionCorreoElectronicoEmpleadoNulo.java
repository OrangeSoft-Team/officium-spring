package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionCorreoElectronicoEmpleadoNulo extends RuntimeException {
    public ExcepcionCorreoElectronicoEmpleadoNulo() {
        super("El correo electrónico del empleado no puede ser nulo");
    }
}
