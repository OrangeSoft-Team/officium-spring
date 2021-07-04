package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionNumeroTelefonicoEmpleadoNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NumeroTelefonicoEmpleado {
    private final String numeroTelefonico;

    public NumeroTelefonicoEmpleado(String numeroTelefonico) {
        validarNumeroTelefonicoEmpleado(numeroTelefonico);
        this.numeroTelefonico = numeroTelefonico;
    }

    private void validarNumeroTelefonicoEmpleado(String numeroTelefonico) {
        if(numeroTelefonico==null)
            throw new ExcepcionNumeroTelefonicoEmpleadoNulo();
        //TODO: Agregar validaciones especificas de formato
    }
}
