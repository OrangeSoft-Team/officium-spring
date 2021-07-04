package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCantidadDuracionEstimadaValorInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class DuracionEstimadaValor {
    private final Integer duracionEstimadaValor;
     public DuracionEstimadaValor(Integer duracionEstimadaValor){
              if(duracionEstimadaValor <0 || duracionEstimadaValor > 99)
             throw new ExcepcionCantidadDuracionEstimadaValorInvalido();
         this.duracionEstimadaValor=duracionEstimadaValor;

     }

}
