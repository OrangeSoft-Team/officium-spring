package com.orangesoft.officium.empleadoApp.empresa.dominio.value;

import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionCorreoElectronicoEmpresaNulo;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionFormatoEmailEmpresaInvalido;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.regex.Pattern;

@EqualsAndHashCode
@Getter
public final class CorreoElectronicoEmpresa {
    private final String correoElectronicoEmpresa;

    public CorreoElectronicoEmpresa(String correoElectronicoEmpresa)  {
        validarCorreoElectronicoEmpresa(correoElectronicoEmpresa);
        this.correoElectronicoEmpresa = correoElectronicoEmpresa;
    }

    private void validarCorreoElectronicoEmpresa(String correoElectronicoEmpresa) {
        if(correoElectronicoEmpresa == null)
            throw new ExcepcionCorreoElectronicoEmpresaNulo();
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@"+
                "(?:[a-zA-Z0-9-]+\\.)+[a-z"+
                "A-Z]{2,7}$";
        Pattern patronEsperado = Pattern.compile(regex);
        if (!patronEsperado.matcher(correoElectronicoEmpresa).matches())
            throw new ExcepcionFormatoEmailEmpresaInvalido();
    }
}
