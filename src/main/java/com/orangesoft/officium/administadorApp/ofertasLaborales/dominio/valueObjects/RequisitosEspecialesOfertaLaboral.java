package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTamanoNombreEstadoInvalido;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionTituloOfertaLaboralNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class RequisitosEspecialesOfertaLaboral {
    private String requisitosEspeciales;

    public RequisitosEspecialesOfertaLaboral(String requisitosEspeciales) {

        this.requisitosEspeciales = requisitosEspeciales;
    }
}
