package com.orangesoft.officium.empleadoApp.empleado.dominio.values;

import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionCorreoElectronicoEmpleadoNulo;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionFormatoEmailEmpleadoInvalido;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionFormatoEmailEmpresaInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.regex.Pattern;

@EqualsAndHashCode
@Getter
public final class CorreoElectronicoEmpleado {
    private final String correoElectronicoEmpleado;

    public CorreoElectronicoEmpleado(String correoElectronicoEmpleado) {
        validarCorreoElectronicoEmpleado(correoElectronicoEmpleado);
        this.correoElectronicoEmpleado = correoElectronicoEmpleado;
    }

    public void validarCorreoElectronicoEmpleado(String correoElectronicoEmpleado) {
        if(correoElectronicoEmpleado == null)
            throw new ExcepcionCorreoElectronicoEmpleadoNulo();
        String regex = "^(.+)@(.+)$";
        Pattern patronEsperado = Pattern.compile(regex);
        if (!patronEsperado.matcher(correoElectronicoEmpleado).matches())
            throw new ExcepcionFormatoEmailEmpleadoInvalido();
    }
}
