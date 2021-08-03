package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones;

public class ExcepcionFechaLimitePostulacionInvalida extends RuntimeException{
    public ExcepcionFechaLimitePostulacionInvalida() {
        super("La fecha límite de postulacion debe ser mayor o igual a la de publicacion");
    }
}
