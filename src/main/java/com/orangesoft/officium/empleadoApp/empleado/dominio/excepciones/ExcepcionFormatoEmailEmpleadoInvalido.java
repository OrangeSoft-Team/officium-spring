package com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones;

public class ExcepcionFormatoEmailEmpleadoInvalido extends RuntimeException {
    public ExcepcionFormatoEmailEmpleadoInvalido() {
        super("El correo electronico del empleado es inválido");
    }
}
