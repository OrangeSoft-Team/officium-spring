package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionDuracionEstimadaOfertaLaboralNula extends RuntimeException{
    public ExcepcionDuracionEstimadaOfertaLaboralNula() {
        super("La duracion estimada no puede ser nula");
    }
}
