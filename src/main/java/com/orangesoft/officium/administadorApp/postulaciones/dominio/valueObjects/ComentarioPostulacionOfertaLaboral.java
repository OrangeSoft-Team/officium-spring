package com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class ComentarioPostulacionOfertaLaboral {
    private String comentarioPostulacion;

    public ComentarioPostulacionOfertaLaboral(String comentarioPostulacion){
        if (comentarioPostulacion == null || comentarioPostulacion.isEmpty()){
            throw new ExcepcionCampoNulo("uuid postulacion");
        }
        this.comentarioPostulacion = comentarioPostulacion;
    }
}
