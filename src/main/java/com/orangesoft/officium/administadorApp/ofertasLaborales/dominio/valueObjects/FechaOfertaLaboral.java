package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionFechaNula;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionFormatoFechaInvalido;

@EqualsAndHashCode
@Getter
public final class FechaOfertaLaboral {
    private final String fechaOfertaLaboral;

    public FechaOfertaLaboral(String fechaOfertaLaboral) {
        if(fechaOfertaLaboral == null || fechaOfertaLaboral.isEmpty())
            throw new ExcepcionFechaNula();

        Pattern pattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$", Pattern.LITERAL);
        Matcher matcher = pattern.matcher(fechaOfertaLaboral);
        if(!matcher.find()) {
            throw new ExcepcionFormatoFechaInvalido();
        }

        this.fechaOfertaLaboral = fechaOfertaLaboral;
    }
}
