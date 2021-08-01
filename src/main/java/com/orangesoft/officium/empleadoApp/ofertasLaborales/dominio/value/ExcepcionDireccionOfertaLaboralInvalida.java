package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

public class ExcepcionDireccionOfertaLaboralInvalida extends RuntimeException{
    public ExcepcionDireccionOfertaLaboralInvalida() {
        super("La direccion de una oferta laboral no puede ser nula o estar vacia");
    }
}
