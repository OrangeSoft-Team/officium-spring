package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.RabbitMQ.evento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventoBase {
    private String fecha;
    private String nombre;
    private String datos;
    private String backend = "Spring";
}
