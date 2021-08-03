package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.ExcepcionDuracionEstimadaValorNulo;

public class DuracionEstimada {
 private final int duracionEstimadaValor;
 private final EnumDuracionEstimada duracionEstimada;

 public DuracionEstimada(int duracionEstimadaValor,EnumDuracionEstimada duracionEstimada){
     validarDuracionEstimadaOfertaLaboral(duracionEstimadaValor);
     this.duracionEstimadaValor=duracionEstimadaValor;
     this.duracionEstimada=duracionEstimada;
 }

         private void validarDuracionEstimadaOfertaLaboral(int duracionEstimadaValor) {
           if(duracionEstimadaValor < 0 || duracionEstimadaValor > 99)
               throw new ExcepcionDuracionEstimadaValorNulo() ;
       }

   }

