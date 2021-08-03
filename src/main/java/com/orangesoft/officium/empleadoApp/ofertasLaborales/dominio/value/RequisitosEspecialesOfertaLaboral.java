package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionRequisitosEspecialesOfertaLaboralInvalidos;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class RequisitosEspecialesOfertaLaboral {
    private String requisitosEspeciales;

    public RequisitosEspecialesOfertaLaboral(String requisitosEspeciales) {
        if(requisitosEspeciales != null && requisitosEspeciales.length() > 256)
            throw new ExcepcionRequisitosEspecialesOfertaLaboralInvalidos();
        this.requisitosEspeciales = requisitosEspeciales;
    }
}
