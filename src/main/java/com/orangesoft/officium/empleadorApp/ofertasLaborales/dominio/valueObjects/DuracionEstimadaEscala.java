package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;


import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class DuracionEstimadaEscala {
    private final String duracionEstimadaEscala;

    public DuracionEstimadaEscala(String duracionEstimadaEscala){
        this.duracionEstimadaEscala=duracionEstimadaEscala;
    }

}
