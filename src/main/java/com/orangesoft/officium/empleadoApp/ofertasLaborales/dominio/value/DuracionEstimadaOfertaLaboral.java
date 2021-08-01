package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEscalaDuracionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionDuracionEstimaOfertaLaboralInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public final class DuracionEstimadaOfertaLaboral {
    private final int duracionEstimada;
    private final EnumEscalaDuracionOfertaLaboral escalaTiempo;

    public DuracionEstimadaOfertaLaboral(int duracionEstimada, EnumEscalaDuracionOfertaLaboral escalaTiempo) {
        validarDuracionEstimadaOfertaLaboral(duracionEstimada);
        this.duracionEstimada = duracionEstimada;
        this.escalaTiempo = escalaTiempo;
    }

    private void validarDuracionEstimadaOfertaLaboral(int duracionEstimada) {
        if(duracionEstimada < 0 || duracionEstimada > 99)
            throw new ExcepcionDuracionEstimaOfertaLaboralInvalida() ;
    }
}
