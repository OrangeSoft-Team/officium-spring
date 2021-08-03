package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones;

public class ExcepcionNombreEmpresaExperienciaLaboralNula extends RuntimeException {
    public ExcepcionNombreEmpresaExperienciaLaboralNula() {
        super("El nombre de la empresa en la experiencia laboral no puede ser nula");
    }
}
