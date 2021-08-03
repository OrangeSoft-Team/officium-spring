package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.comun.dominio.postulacionOfertaLaboral.EnumEstatusPostulacionOfertaLaboral;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
public final class EstadoPostulacionOfertaLaboral {
    private final EnumEstatusPostulacionOfertaLaboral estado;
}
