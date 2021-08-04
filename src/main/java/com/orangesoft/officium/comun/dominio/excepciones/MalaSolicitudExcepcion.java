package com.orangesoft.officium.comun.dominio.excepciones;

public class MalaSolicitudExcepcion extends RuntimeException{
    public MalaSolicitudExcepcion(String campo) {
        super(campo);
    }
}
