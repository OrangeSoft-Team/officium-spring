package com.orangesoft.officium.comun.RabbitMQ;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

    public static final String QUEUE = "Cola";
    public static final String EXCHANGE = "exchange_queue_spring";
    public static final String ROUTING_KEY ="spring_key";

    // Definimos una cola
    @Bean
    public Queue queue() {
        return new Queue(QUEUE);
    }

    // Definimos el exchange
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    // Definimos una relación entre ambos
    @Bean
    public Binding binding (Queue queue, TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    // Se establece el convertidor
    @Bean
    public MessageConverter converter(){
        return new Jackson2JsonMessageConverter();
    }

    // Prueba de un template
    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory) {
        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(converter());
        return rabbitTemplate;
    }
}
