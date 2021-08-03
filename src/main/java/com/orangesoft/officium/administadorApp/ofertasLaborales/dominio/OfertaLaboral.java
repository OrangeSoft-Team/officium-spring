package com.orangesoft.officium.administadorApp.ofertasLaborales.dominio;

import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.*;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.*;

import java.util.List;

@EqualsAndHashCode
//@Builder
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
    private EstadoOfertaLaboral estadoOfertaLaboral;
    private RequisitosEspecialesOfertaLaboral requisitosEspecialesOfertaLaboral;
    private NombreDireccionOfertaLaboral direccionOfertaLaboral;
    private IdEmpresa idEmpresaOfertaLaboral;
    private NombreEmpresa nombreEmpresaOfertaLaboral;
    private List<Habilidad> habilidades;

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
                         RequisitosEspecialesOfertaLaboral requisitosEspecialesOfertaLaboral,
                         EstadoOfertaLaboral estadoOfertaLaboral,
                         NombreDireccionOfertaLaboral direccionOfertaLaboral,
                         IdEmpresa idEmpresaOfertaLaboral,
                         NombreEmpresa nombreEmpresaOfertaLaboral,
                         List<Habilidad> habilidades) {
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
        if (requisitosEspecialesOfertaLaboral == null)
            throw  new ExcepcionCampoNulo("requisitos especiales");
        if (estadoOfertaLaboral == null)
            throw  new ExcepcionCampoNulo("estado");
        // TODO: revisar este atributo ya que se usa para colocar el nombre y el id de la ciudad
//        if (nombreCiudadOfertaLaboral == null)
//            throw new ExcepcionCampoNulo("nombre direccion");
        if (idEmpresaOfertaLaboral == null)
            throw new ExcepcionCampoNulo("id empresa");
//        if (nombreEmpresaOfertaLaboral == null)
//            throw new ExcepcionCampoNulo("nombre empresa");

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
        this.estadoOfertaLaboral = estadoOfertaLaboral;
        this.requisitosEspecialesOfertaLaboral = requisitosEspecialesOfertaLaboral;
        this.direccionOfertaLaboral = direccionOfertaLaboral;
        this.idEmpresaOfertaLaboral = idEmpresaOfertaLaboral;
        this.nombreEmpresaOfertaLaboral = nombreEmpresaOfertaLaboral;
        this.habilidades = habilidades;
    }
}
