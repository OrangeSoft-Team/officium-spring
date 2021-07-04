package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones;

public class ExcepcionTamanoNombreEstadoInvalido extends RuntimeException {
    public ExcepcionTamanoNombreEstadoInvalido() {
        super("Tamaño del nombre inválido");
    }
}
