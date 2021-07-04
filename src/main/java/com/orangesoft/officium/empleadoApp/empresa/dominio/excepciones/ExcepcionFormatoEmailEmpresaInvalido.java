package com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones;

public class ExcepcionFormatoEmailEmpresaInvalido extends  RuntimeException {
    public ExcepcionFormatoEmailEmpresaInvalido() {
        super("El email suministrado para la empresa no es válido");
    }
}
