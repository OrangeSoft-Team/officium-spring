package com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio;

import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.excepciones.*;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class OfertaLaboral {
     private IdEmpresa idEmpresa;
     private IdOfertaLaboral idOfertaLaboral;
     private Titulo titulo;
     private FechaPublicacion fechaPublicacion;
     private FechaUltimaModificacion fechaUltimaModificacion;
     private Cargo cargo;
     private Sueldo sueldo;
     private Descripcion descripcion;
     private DuracionEstimadaEscala duracionEstimadaEscala;
     private DuracionEstimadaValor duracionEstimadaValor;
     private TurnoTrabajo turnoTrabajo;
     private NumeroVacantes numeroVacantes;
     private Estado estado;

    public OfertaLaboral(Titulo titulo,FechaPublicacion fechaPublicacion,FechaUltimaModificacion fechaUltimaModificacion,
                         Cargo cargo, Sueldo sueldo, Descripcion descripcion,DuracionEstimadaEscala duracionEstimadaEscala, DuracionEstimadaValor duracionEstimadaValor,
                         TurnoTrabajo turnoTrabajo, NumeroVacantes numeroVacantes, Estado estado){
          if(titulo==null)
               throw new ExcepcionTituloNulo();
          if(fechaPublicacion==null)
              throw new ExcepcionFechaPublicacionNulo();
          if(fechaUltimaModificacion==null)
              throw new ExcepcionFechaUltimaModificacion();
          if(cargo==null)
               throw  new ExcepcionCargoNulo();
          if(sueldo==null)
               throw new ExcepcionSueldoNulo();
          if (descripcion==null)
               throw new ExcepcionDescripcionNulo();
          if(duracionEstimadaEscala==null)
               throw new ExcepcionDuracionEstimadaEscalaNulo();
          if(duracionEstimadaValor==null)
               throw new ExcepcionDuracionEstimadaValorNulo();
          if(turnoTrabajo==null)
               throw new ExcepcionTurnoTrabajoNulo();
          if(numeroVacantes==null)
               throw new ExcepcionNumeroVacantesNulo();
          if(estado==null)
               throw new ExcepcionEstadoNulo();

         this.titulo=titulo;
         this.fechaPublicacion=fechaPublicacion;
         this.fechaUltimaModificacion=fechaUltimaModificacion;
         this.cargo=cargo;
         this.sueldo=sueldo;
         this.descripcion=descripcion;
         this.duracionEstimadaEscala=duracionEstimadaEscala;
         this.duracionEstimadaValor=duracionEstimadaValor;
         this.turnoTrabajo=turnoTrabajo;
         this.numeroVacantes=numeroVacantes;
         this.estado=estado;

    }

}
