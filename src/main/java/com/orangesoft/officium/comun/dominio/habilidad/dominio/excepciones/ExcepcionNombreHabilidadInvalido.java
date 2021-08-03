package com.orangesoft.officium.comun.dominio.habilidad.dominio.excepciones;

public class ExcepcionNombreHabilidadInvalido extends RuntimeException {
    public ExcepcionNombreHabilidadInvalido() {
        super("El nombre de la habilidad no puede ser nulo o estar vacio");
    }
}
