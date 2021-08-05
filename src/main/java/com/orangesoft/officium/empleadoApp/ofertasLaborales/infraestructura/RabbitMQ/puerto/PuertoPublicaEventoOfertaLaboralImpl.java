package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.RabbitMQ.puerto;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoPublicaEventoOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.RabbitMQ.evento.EventoBase;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.RabbitMQ.publicador.PublicadorOfertasLaborales;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@AllArgsConstructor
public class PuertoPublicaEventoOfertaLaboralImpl implements PuertoPublicaEventoOfertaLaboral {
    @Autowired
    private final PublicadorOfertasLaborales publicadorOfertasLaborales;

    @Override
    public void publicarEvento(String nombreEvento, Instant fechaEvento, String resultadoEvento) {
        EventoBase eventoBase = new EventoBase(
                Instant.now().toString(),
                nombreEvento,
                resultadoEvento,
                "Spring");
    }
}
