package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones;

public class ExcepcionFechaInicioExperenciaLaboralInvalida extends RuntimeException {
    public ExcepcionFechaInicioExperenciaLaboralInvalida() {
        super("La fecha de inicio de la experiencia laboral no es válida");
    }
}
