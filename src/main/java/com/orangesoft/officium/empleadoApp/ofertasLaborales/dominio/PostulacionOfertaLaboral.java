package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionEstadoPostulacionOfertaLaboralNula;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaLimitePostulacionInvalida;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionIdOfertaLaboralNulo;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import lombok.*;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class PostulacionOfertaLaboral {
    private IdPostulacionOfertaLaboral idPostulacionOfertaLaboral;
    private FechaPostulacionOfertaLaboral fechaPostulacionOfertaLaboral;
    private EstadoPostulacionOfertaLaboral estadoPostulacionOfertaLaboral;
    private IdOfertaLaboral idOfertaLaboral;
    private IdEmpleado idEmpleado;
    private ComentarioPostulacionOfertaLaboral comentarioPostulacionOfertaLaboral;

    public PostulacionOfertaLaboral(IdPostulacionOfertaLaboral idPostulacionOfertaLaboral,
                                    FechaPostulacionOfertaLaboral fechaPostulacionOfertaLaboral,
                                    EstadoPostulacionOfertaLaboral estadoOfertaLaboral,
                                    IdOfertaLaboral idOfertaLaboral,
                                    IdEmpleado idEmpleado,
                                    ComentarioPostulacionOfertaLaboral comentarioPostulacionOfertaLaboral) {
        this.idPostulacionOfertaLaboral = idPostulacionOfertaLaboral;
        this.fechaPostulacionOfertaLaboral = fechaPostulacionOfertaLaboral;
        this.estadoPostulacionOfertaLaboral = estadoOfertaLaboral;
        this.idOfertaLaboral = idOfertaLaboral;
        this.idEmpleado = idEmpleado;
        this.comentarioPostulacionOfertaLaboral = comentarioPostulacionOfertaLaboral;
    }

    private void validarPostulacionOfertaLaboral() {
        if(idPostulacionOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo();
        if(fechaPostulacionOfertaLaboral == null)
            throw new ExcepcionFechaLimitePostulacionInvalida();
        if(estadoPostulacionOfertaLaboral == null)
            throw new ExcepcionEstadoPostulacionOfertaLaboralNula();
        if(idOfertaLaboral == null)
            throw new ExcepcionIdOfertaLaboralNulo();
        if(idEmpleado == null)
            throw new ExcepcionIdEmpresaNulo();
        if(comentarioPostulacionOfertaLaboral == null)
            comentarioPostulacionOfertaLaboral = new ComentarioPostulacionOfertaLaboral(null);
    }
}
