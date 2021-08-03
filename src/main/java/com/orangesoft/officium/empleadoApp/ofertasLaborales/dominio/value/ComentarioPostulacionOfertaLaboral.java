package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionComentarioPostulacionOfertaLaboralInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class ComentarioPostulacionOfertaLaboral {
    private final String comentario;

    public ComentarioPostulacionOfertaLaboral(String comentario) {
        if(comentario != null && comentario.length() > 256)
            throw new ExcepcionComentarioPostulacionOfertaLaboralInvalido();
        this.comentario = comentario;
    }
}
