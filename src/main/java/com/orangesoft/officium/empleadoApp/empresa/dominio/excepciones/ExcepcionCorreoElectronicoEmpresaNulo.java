package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionCorreoElectronicoEmpresaNulo extends RuntimeException {
    public ExcepcionCorreoElectronicoEmpresaNulo() {
        super("El correo electrónico de la empresa no puede ser nulo");
    }
}
