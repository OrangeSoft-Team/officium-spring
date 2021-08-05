package com.orangesoft.officium.empleadoApp.trabajo.aplicacion;

public class ExcepcionSolicitudDeRenunciaInvalida extends RuntimeException {
    public ExcepcionSolicitudDeRenunciaInvalida() {
        super("La solicitud de renuncia no es válida");
    }
}
