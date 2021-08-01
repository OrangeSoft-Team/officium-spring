package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaLimitePostulacionInvalida;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaPublicacionOfertaLaboralNula;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionLongitudTituloOfertaLaboralInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public final class FechaPublicacionOfertaLaboral {
    private final Instant fechaPublicacion;
    private final Instant fechaLimitePostulacion;
    private final Instant fechaUltimaModificacion;

    public FechaPublicacionOfertaLaboral(Instant fechaPublicacion,
                                         Instant fechaUltimaModificacion,
                                         Instant fechaLimitePostulacion
        ) {
        if(fechaUltimaModificacion==null)
             fechaUltimaModificacion = fechaPublicacion;
        validarFechaPublicacion(fechaPublicacion);
        validarfechaUltimaModificacion(fechaPublicacion, fechaUltimaModificacion);
        validarFechaLimitePostulacion(fechaLimitePostulacion,fechaPublicacion);
        this.fechaPublicacion = fechaPublicacion;
        this.fechaUltimaModificacion = fechaUltimaModificacion;
        this.fechaLimitePostulacion = fechaLimitePostulacion;
    }

    private void validarfechaUltimaModificacion(Instant fechaPublicacion, Instant fechaUltimaModificacion) {
        if(fechaUltimaModificacion.isBefore(fechaPublicacion))
            throw new ExcepcionLongitudTituloOfertaLaboralInvalida();
    }

    private void validarFechaPublicacion(Instant fechaPublicacion) {
        if(fechaPublicacion == null)
            throw new ExcepcionFechaPublicacionOfertaLaboralNula();
    }

    private void validarFechaLimitePostulacion(Instant fechaLimitePostulacion, Instant fechaPublicacion) {
        if(fechaLimitePostulacion != null && fechaLimitePostulacion.isBefore(fechaPublicacion))
            throw new ExcepcionFechaLimitePostulacionInvalida();
    }
}
