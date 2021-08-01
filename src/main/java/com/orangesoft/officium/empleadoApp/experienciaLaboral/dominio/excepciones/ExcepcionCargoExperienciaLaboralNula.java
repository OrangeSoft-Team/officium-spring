package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones;

public class ExcepcionCargoExperienciaLaboralNula extends RuntimeException {
    public ExcepcionCargoExperienciaLaboralNula() {
        super("El cargo de la experiencia laboral no puede ser nulo");
    }
}
