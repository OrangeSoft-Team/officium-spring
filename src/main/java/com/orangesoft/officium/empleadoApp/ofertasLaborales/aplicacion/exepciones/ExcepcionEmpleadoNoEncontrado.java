package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones;

public class ExcepcionEmpleadoNoEncontrado extends RuntimeException {
    public ExcepcionEmpleadoNoEncontrado() {
        super("El empleado solicitado no se encuentra activo o no existe");
    }
}
