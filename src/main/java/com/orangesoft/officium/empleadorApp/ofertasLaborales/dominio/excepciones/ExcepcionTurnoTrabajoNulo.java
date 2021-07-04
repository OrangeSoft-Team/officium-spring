package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTurnoTrabajoNulo extends RuntimeException{
    public ExcepcionTurnoTrabajoNulo(){
        super("El turno de trabajo no puede ser nulo");
    }
}
