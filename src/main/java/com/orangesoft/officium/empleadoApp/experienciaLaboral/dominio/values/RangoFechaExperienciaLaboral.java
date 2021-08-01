package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values;

import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionFechaFinExperienciaLaboralInvalida;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionFechaInicioExperenciaLaboralInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;

@EqualsAndHashCode
@Getter
public class RangoFechaExperienciaLaboral {
    private final Instant fechaInicio;
    private final Instant fechaFin;

    public RangoFechaExperienciaLaboral(Instant fechaInicio, Instant fechaFin) {
        if(fechaInicio == null || fechaInicio.isAfter(Instant.now()))
            throw new ExcepcionFechaInicioExperenciaLaboralInvalida();
        if(fechaFin == null)
            throw new ExcepcionFechaFinExperienciaLaboralInvalida();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}
