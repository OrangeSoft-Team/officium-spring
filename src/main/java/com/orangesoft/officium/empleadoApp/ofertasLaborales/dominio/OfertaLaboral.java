package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio;

import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class OfertaLaboral {
    // Informacion de la oferta
    private IdEmpresa idEmpresa;
    private IdOfertaLaboral idOfertaLaboral;
    private TituloOfertaLaboral tituloOfertaLaboral;
    private FechaPublicacionOfertaLaboral fechaPublicacionOfertaLaboral;
    private CargoOfertaLaboral cargoOfertaLaboral;
    private SueldoOfertaLaboral sueldoOfertaLaboral;
    private DescripcionOfertaLaboral descripcionOfertaLaboral;
    private DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral;
    private TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral;
    private NumeroVacantes numeroVacantes;
    private RequisitosEspecialesOfertaLaboral requisitosEspecialesOfertaLaboral;
    private EstadoOfertaLaboral estadoOfertaLaboral;

    //Agregados
    //Direccion direccion;
    private List<Habilidad> habilidades;
    private List<PostulacionOfertaLaboral> postulacionesOfertaLaboral;

    public OfertaLaboral(IdEmpresa idEmpresa,
                         IdOfertaLaboral idOfertaLaboral,
                         TituloOfertaLaboral tituloOfertaLaboral,
                         FechaPublicacionOfertaLaboral fechaPublicacionOfertaLaboral,
                         CargoOfertaLaboral cargoOfertaLaboral,
                         SueldoOfertaLaboral sueldoOfertaLaboral,
                         DescripcionOfertaLaboral descripcionOfertaLaboral,
                         DuracionEstimadaOfertaLaboral duracionEstimadaOfertaLaboral,
                         TurnoTrabajoOfertaLaboral turnoTrabajoOfertaLaboral,
                         NumeroVacantes numeroVacantes,
                         RequisitosEspecialesOfertaLaboral requisitosEspecialesOfertaLaboral,
                         EstadoOfertaLaboral estadoOfertaLaboral,
                         List<Habilidad> habilidades,
                         List<PostulacionOfertaLaboral> postulacionesOfertaLaboral
    ){
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
        this.requisitosEspecialesOfertaLaboral = requisitosEspecialesOfertaLaboral;
        if(habilidades == null)
            habilidades = new ArrayList<>();
        this.habilidades = habilidades;
        if(postulacionesOfertaLaboral == null)
            postulacionesOfertaLaboral = new ArrayList<>();
        this.postulacionesOfertaLaboral = postulacionesOfertaLaboral;
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
        if(requisitosEspecialesOfertaLaboral == null)
            new RequisitosEspecialesOfertaLaboral(null);
    }
}
