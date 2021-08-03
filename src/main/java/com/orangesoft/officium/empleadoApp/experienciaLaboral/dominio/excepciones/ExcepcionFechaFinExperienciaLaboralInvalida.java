package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones;

public class ExcepcionFechaFinExperienciaLaboralInvalida extends RuntimeException {
    public ExcepcionFechaFinExperienciaLaboralInvalida() {
        super("La fecha de finalización de la experiencia laboral no puede ser nula");
    }
}
