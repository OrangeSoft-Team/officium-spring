package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaPublicacionOfertaLaboralNula;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionLongitudTituloOfertaLaboralInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public final class FechaPublicacionOfertaLaboral {
    private final Instant fechaPublicacion;
    private final Instant fechaUltimaModificacion;

    public FechaPublicacionOfertaLaboral(Instant fechaPublicacion, Instant fechaUltimaModificacion) {
        validarFechaPublicacion(fechaPublicacion);
        validarfechaUltimaModificacion(fechaUltimaModificacion);
        this.fechaPublicacion = fechaPublicacion;
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    private void validarfechaUltimaModificacion(Instant fechaUltimaModificacion) {
        if(fechaUltimaModificacion == null)
            throw new ExcepcionFechaPublicacionOfertaLaboralNula();
        if(fechaUltimaModificacion.isBefore(fechaUltimaModificacion))
            throw new ExcepcionLongitudTituloOfertaLaboralInvalida();
    }
    private void validarFechaPublicacion(Instant fechaPublicacion) {
        if(fechaPublicacion == null)
            throw new ExcepcionFechaPublicacionOfertaLaboralNula() ;
    }

}
