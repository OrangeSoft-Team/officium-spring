package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio;

import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class OfertaLaboral {
    private IdEmpresa idEmpresa;
    private IdOfertaLaboral idOfertaLaboral;
    private TituloOfertaLaboral tituloOfertaLaboral;
    private CargoOfertaLaboral cargoOfertaLaboral;
    private FechaPublicacionOfertaLaboral fechaPublicacionOfertaLaboral;
    private SueldoOfertaLaboral sueldoOfertaLaboral;
    private DescripcionOfertaLaboral descripcionOfertaLaboral;
    private DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral;
    private TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral;
    private NumeroVacantes numeroVacantes;
    private EstadoOfertaLaboral estadoOfertaLaboral;

    public OfertaLaboral(IdEmpresa idEmpresa,
                         IdOfertaLaboral idOfertaLaboral,
                         TituloOfertaLaboral tituloOfertaLaboral,
                         CargoOfertaLaboral cargoOfertaLaboral,
                         FechaPublicacionOfertaLaboral fechaPublicacionOfertaLaboral,
                         SueldoOfertaLaboral sueldoOfertaLaboral,
                         DescripcionOfertaLaboral descripcionOfertaLaboral,
                         DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral,
                         TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral,
                         NumeroVacantes numeroVacantes,
                         EstadoOfertaLaboral estadoOfertaLaboral) {
        this.idEmpresa = idEmpresa;
        this.idOfertaLaboral = idOfertaLaboral;
        this.tituloOfertaLaboral = tituloOfertaLaboral;
        this.cargoOfertaLaboral = cargoOfertaLaboral;
        this.fechaPublicacionOfertaLaboral = fechaPublicacionOfertaLaboral;
        this.sueldoOfertaLaboral = sueldoOfertaLaboral;
        this.descripcionOfertaLaboral = descripcionOfertaLaboral;
        this.duracionEstimadaOfertaLaboral = duracionEstimadaOfertaLaboral;
        this.turnoTrabajoOfertaLaboral = turnoTrabajoOfertaLaboral;
        this.numeroVacantes = numeroVacantes;
        this.estadoOfertaLaboral = estadoOfertaLaboral;
        validarOfertaLaboral();
    }

    private void validarOfertaLaboral() {
        if(idEmpresa == null)
            throw new ExcepcionIdEmpresaNulo();
        if(idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo();
        if(tituloOfertaLaboral == null)
            throw new ExcepcionTituloOfertaLaboralNulo();
        if(cargoOfertaLaboral == null)
            throw new ExcepcionCargoOfertaLaboralNulo();
        if(fechaPublicacionOfertaLaboral == null)
            throw new ExcepcionFechaPublicacionOfertaLaboralNula();
        if(sueldoOfertaLaboral == null)
            throw new ExcepcionSueldoOfertaLaboralNulo();
        if(descripcionOfertaLaboral == null)
            throw new ExcepcionDescripcionOfertaLaboraNula();
        if(duracionEstimadaOfertaLaboral == null)
            throw new ExcepcionDuracionEstimadaOfertaLaboralNula();
        if(turnoTrabajoOfertaLaboral == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo();
        if(numeroVacantes == null)
            throw new ExcepcionEstadoOfertaLaboralNulo();
        if(estadoOfertaLaboral == null)
            throw new ExcepcionEstadoOfertaLaboralNulo();
    }
}
