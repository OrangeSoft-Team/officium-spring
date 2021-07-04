package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.*;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class OfertaLaboral {
    private IdOfertaLaboral idOfertaLaboral;
    private TituloOfertaLaboral tituloOfertaLaboral;
    private FechaOfertaLaboral fechaPublicacionOfertaLaboral;
    private FechaOfertaLaboral fechaUltimaModificacionOfertaLaboral;
    private CargoOfertaLaboral cargoOfertaLaboral;
    private SueldoOfertaLaboral sueldoOfertaLaboral;
    private DescripcionOfertaLaboral descripcionOfertaLaboral;
    private DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral;
    private TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral;
    private NumeroVacantesOfertaLaboral numeroVacantesOfertaLaboral;
    private IdCiudad idCiudadOfertaLaboral;
    private IdEmpresa idEmpresaOfertaLaboral;
    private NombreEmpresa nombreEmpresaOfertaLaboral;

    public OfertaLaboral(IdOfertaLaboral idOfertaLaboral,
                         TituloOfertaLaboral tituloOfertaLaboral,
                         FechaOfertaLaboral fechaPublicacionOfertaLaboral,
                         FechaOfertaLaboral fechaUltimaModificacionOfertaLaboral,
                         CargoOfertaLaboral cargoOfertaLaboral,
                         SueldoOfertaLaboral sueldoOfertaLaboral,
                         DescripcionOfertaLaboral descripcionOfertaLaboral,
                         DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral,
                         TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral,
                         NumeroVacantesOfertaLaboral numeroVacantesOfertaLaboral,
                         IdCiudad idCiudadOfertaLaboral,
                         IdEmpresa idEmpresaOfertaLaboral,
                         NombreEmpresa nombreEmpresaOfertaLaboral) {
        if (idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo();
        if (tituloOfertaLaboral == null)
            throw new ExcepcionTituloOfertaLaboralNulo();
        if (fechaPublicacionOfertaLaboral == null)
            throw new ExcepcionFechaNula();
        if (fechaUltimaModificacionOfertaLaboral == null)
            throw new ExcepcionFechaNula();
        if (cargoOfertaLaboral == null)
            throw new ExcepcionCargoOfertaLaboralNulo();
        if (sueldoOfertaLaboral == null)
            throw new ExcepcionSueldoOfertaLaboralInvalido();
        if (descripcionOfertaLaboral == null)
            throw new ExcepcionDescripcionOfertaTrabajoNula();
        if (duracionEstimadaOfertaLaboral == null)
            throw new ExcepcionDuracionEstimadaOfertaLaboralNula();
        if (turnoTrabajoOfertaLaboral == null)
            throw new ExcepcionTurnoTrabajoOfertaLaboralNulo();
        if (numeroVacantesOfertaLaboral == null)
            throw new ExcepcionNumeroVacantesOfertaLaboralNulo();
        if (idCiudadOfertaLaboral == null)
            throw new ExcepcionIdCiudadNulo();
        if (idEmpresaOfertaLaboral == null)
            throw new ExcepcionCampoNulo("id empresa");
        if (nombreEmpresaOfertaLaboral == null)
            throw new ExcepcionCampoNulo("nombre empresa");

        this.idOfertaLaboral = idOfertaLaboral;
        this.tituloOfertaLaboral = tituloOfertaLaboral;
        this.fechaPublicacionOfertaLaboral = fechaPublicacionOfertaLaboral;
        this.fechaUltimaModificacionOfertaLaboral = fechaUltimaModificacionOfertaLaboral;
        this.cargoOfertaLaboral = cargoOfertaLaboral;
        this.sueldoOfertaLaboral = sueldoOfertaLaboral;
        this.descripcionOfertaLaboral = descripcionOfertaLaboral;
        this.duracionEstimadaOfertaLaboral = duracionEstimadaOfertaLaboral;
        this.turnoTrabajoOfertaLaboral = turnoTrabajoOfertaLaboral;
        this.numeroVacantesOfertaLaboral = numeroVacantesOfertaLaboral;
        this.idCiudadOfertaLaboral = idCiudadOfertaLaboral;
        this.idEmpresaOfertaLaboral = idEmpresaOfertaLaboral;
        this.nombreEmpresaOfertaLaboral = nombreEmpresaOfertaLaboral;
    }
}
