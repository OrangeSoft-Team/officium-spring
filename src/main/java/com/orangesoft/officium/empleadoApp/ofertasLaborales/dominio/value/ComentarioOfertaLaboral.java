package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionComentarioOfertaLaboralInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class ComentarioOfertaLaboral {
    private final String comentario;

    public ComentarioOfertaLaboral(String comentario) {
        if(comentario != null && comentario.length() > 256)
            throw new ExcepcionComentarioOfertaLaboralInvalido();
        this.comentario = comentario;
    }
}
