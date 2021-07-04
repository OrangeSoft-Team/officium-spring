package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class NombreEmpleado {
    private final String primerNombre;
    private final String segundoNombre;
    private final String primerApellido;
    private final String segundoApellido;

    public NombreEmpleado(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        validarPrimerNombreEmpleado(primerNombre);
        validarPrimerApellidoEmpleado(primerApellido);
        validarSegundoNombreEmpleado(segundoNombre);
        validarSegundoApellidoEmpleado(segundoApellido);
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    private void validarPrimerNombreEmpleado(String primerNombre) {
        if(primerNombre == null)
            throw new ExcepcionPrimerNombreEmpleadoNulo();
        if(primerNombre.length() < 3 || primerNombre.length() > 40)
            throw new ExcepcionLongitudPrimerNombreEmpleadoInvalida();
    }

    private void validarSegundoNombreEmpleado(String segundoNombre) {
        if(segundoNombre != null && (segundoNombre.length() < 3 || segundoNombre.length() > 40))
            throw new ExcepcionLongitudSegundoNombreEmpleadoInvalida();
    }

    private void validarPrimerApellidoEmpleado(String primerApellido) {
        if(primerApellido == null)
            throw new ExcepcionPrimerApellidoEmpleadoNulo();
        if(primerApellido.length() < 3 || primerApellido.length() > 40)
            throw new ExcepcionLongitudPrimerApellidoEmpleadoInvalida();
    }

    private void validarSegundoApellidoEmpleado(String segundoApellido) {
        if(segundoApellido != null && (segundoApellido.length() < 3 || segundoApellido.length() > 40))
            throw new ExcepcionLongitudSegundoApellidoInvalida();
    }
}
