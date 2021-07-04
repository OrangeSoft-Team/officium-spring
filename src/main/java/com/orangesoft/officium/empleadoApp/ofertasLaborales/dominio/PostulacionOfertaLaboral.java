package com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio;

import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.ComentarioOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.EstadoPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.FechaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PostulacionOfertaLaboral {
    private IdEmpresa idEmpresa;
    private IdOfertaLaboral idOfertaLaboral;
    private IdEmpleado idEmpleado;
    private FechaPostulacionOfertaLaboral fechaPostulacion;
    private ComentarioOfertaLaboral comentarioOfertaLaboral;
    private EstadoPostulacionOfertaLaboral estadoOfertaLaboral;
}
