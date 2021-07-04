package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionValorInvalido;

@EqualsAndHashCode
@Getter
public final class CorreoElectronicoEmpresa {
    private final String correoElectronicoEmpresa;

    public CorreoElectronicoEmpresa(String correoElectronicoEmpresa) {
        if(correoElectronicoEmpresa == null || correoElectronicoEmpresa.isEmpty())
            throw new ExcepcionCampoNulo("correo electrónico");

        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(correoElectronicoEmpresa);
        if(!matcher.find()) {
            throw new ExcepcionValorInvalido("correo electrónico");
        }

        this.correoElectronicoEmpresa = correoElectronicoEmpresa;
    }
}
