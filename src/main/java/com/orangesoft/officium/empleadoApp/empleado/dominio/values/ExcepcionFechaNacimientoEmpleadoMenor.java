package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

public class ExcepcionFechaNacimientoEmpleadoMenor extends RuntimeException{
    public ExcepcionFechaNacimientoEmpleadoMenor(){
        super("Todos los empleados deben tener más de 18 años");
    }
}
