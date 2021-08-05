package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida;

import java.time.Instant;

public interface PuertoPublicaEventoOfertaLaboral {
    public void publicarEvento(String nombreEvento, Instant fechaEvento, String resultadoEvento);
}
