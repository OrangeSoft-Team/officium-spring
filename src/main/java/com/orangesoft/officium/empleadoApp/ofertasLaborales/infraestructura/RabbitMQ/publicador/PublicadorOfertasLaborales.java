package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.RabbitMQ.publicador;

import com.orangesoft.officium.comun.RabbitMQ.RabbitMQConfig;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.RabbitMQ.evento.EventoBase;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class PublicadorOfertasLaborales {
    @Autowired
    private final RabbitTemplate template;

    public void publicarEvento(EventoBase eventoBase) {
        template.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY, eventoBase);
    }
}
