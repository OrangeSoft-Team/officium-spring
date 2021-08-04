package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto;

public class ExcepcionNoSePuedeRepostularOfertaLaboral extends RuntimeException {
    public ExcepcionNoSePuedeRepostularOfertaLaboral() {
        super("No se puede repostular a una oferta laboral");
    }
}
