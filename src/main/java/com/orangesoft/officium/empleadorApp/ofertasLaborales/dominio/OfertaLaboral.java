package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio;
import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.habilidad.dominio.Excepciones.ExcepcionIdHabilidadNoNull;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.RequisitosEspeciales;
import com.orangesoft.officium.empleadorApp.habilidad.Habilidad;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.*;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.*;
import com.orangesoft.officium.empleadorApp.postulacionOfertaLaboral.PostulacionOfertaLaboral;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
public class OfertaLaboral {
     private IdEmpresa idEmpresa;
     private IdOfertaLaboral idOfertaLaboral;
     private Titulo titulo;
     private FechaPublicacion fechaPublicacion;
     private FechaLimitePostulacion fechaLimitePostulacion;
     private FechaUltimaModificacion fechaUltimaModificacion;
     private Cargo cargo;
     private Sueldo sueldo;
     private Descripcion descripcion;
     private DuracionEstimada duracionEstimada;
     private TurnoTrabajo turnoTrabajo;
     private NumeroVacantes numeroVacantes;
     private Estado estado;
     private RequisitosEspeciales requisitosEspeciales;
     private List<Habilidad> habilidads;
     private List<PostulacionOfertaLaboral> postulacionOfertaLaborals;


     public  OfertaLaboral(
              IdEmpresa idEmpresa,
              IdOfertaLaboral idOfertaLaboral,
              Titulo titulo,
              FechaPublicacion fechaPublicacion,
              FechaLimitePostulacion fechaLimitePostulacion,
              FechaUltimaModificacion fechaUltimaModificacion,
              Cargo cargo,
              Sueldo sueldo,
              Descripcion descripcion,
              DuracionEstimada duracionEstimada,
              TurnoTrabajo turnoTrabajo,
              NumeroVacantes numeroVacantes,
              Estado estado,
              RequisitosEspeciales requisitosEspeciales,
              List<Habilidad> habilidads,
              List<PostulacionOfertaLaboral> postulacionOfertaLaborals
     )
     {     if(idEmpresa==null)
             throw new ExcepcionIdEmpresaNulo();
         if(idOfertaLaboral==null)
             throw new ExcepcionIdEmpresaNulo();
         if(titulo==null)
               throw new ExcepcionTituloNulo();
          if(fechaPublicacion==null)
              throw new ExcepcionFechaPublicacionNulo();
         if(fechaLimitePostulacion==null)
             throw new ExcepcionFechaUltimaModificacion();
          if(fechaUltimaModificacion==null)
              throw new ExcepcionFechaUltimaModificacion();
          if(cargo==null)
               throw  new ExcepcionCargoNulo();
          if(sueldo==null)
               throw new ExcepcionSueldoNulo();
          if (descripcion==null)
               throw new ExcepcionDescripcionNulo();
          if(duracionEstimada==null)
               throw new ExcepcionDuracionEstimadaEscalaNulo();
          if(turnoTrabajo==null)
               throw new ExcepcionTurnoTrabajoNulo();
          if(numeroVacantes==null)
               throw new ExcepcionNumeroVacantesNulo();
          if(estado==null)
               throw new ExcepcionEstadoNulo();
         if(habilidads==null)
             throw new ExcepcionIdHabilidadNoNull();

         this.titulo=titulo;
         this.fechaPublicacion=fechaPublicacion;
         this.fechaLimitePostulacion=fechaLimitePostulacion;;
         this.fechaUltimaModificacion=fechaUltimaModificacion;
         this.cargo=cargo;
         this.sueldo=sueldo;
         this.descripcion=descripcion;
         this.duracionEstimada=duracionEstimada;
         this.turnoTrabajo=turnoTrabajo;
         this.numeroVacantes=numeroVacantes;
         this.estado=estado;
         this.requisitosEspeciales=requisitosEspeciales;
         this.habilidads=habilidads;
         this.postulacionOfertaLaborals=postulacionOfertaLaborals;

    }

}
