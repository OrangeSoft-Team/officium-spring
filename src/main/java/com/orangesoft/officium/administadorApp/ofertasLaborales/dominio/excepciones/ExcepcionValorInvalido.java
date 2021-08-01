package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionValorInvalido extends RuntimeException {
    public ExcepcionValorInvalido(String campo) {
        super("El valor introducido al "+campo+" es invalido.");
    }
    public ExcepcionValorInvalido(String campo, String descripcion) {
        super("El valor introducido al "+campo+" es invalido. "+descripcion);
    }
}
