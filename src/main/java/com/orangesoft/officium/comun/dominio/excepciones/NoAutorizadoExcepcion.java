package com.orangesoft.officium.comun.dominio.excepciones;

public class NoAutorizadoExcepcion extends RuntimeException{
    public NoAutorizadoExcepcion(String campo) {
        super("Usuario no autorizado");
    }
}
