package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionTurnoTrabajoOfertaLaboralNulo extends RuntimeException{
    public ExcepcionTurnoTrabajoOfertaLaboralNulo() {
        super("Se debe asignar un turno de trabajo");
    }
}
