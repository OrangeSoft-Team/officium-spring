package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones;

public class ExcepcionIdExperienciaLaboralNulo extends RuntimeException {
    public ExcepcionIdExperienciaLaboralNulo() {
        super("El identificador de la experiencia laboral no puede ser nulo");
    }
}
