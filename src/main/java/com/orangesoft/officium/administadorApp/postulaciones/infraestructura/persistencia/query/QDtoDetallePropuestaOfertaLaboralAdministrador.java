package com.orangesoft.officium.administadorApp.postulaciones.infraestructura.persistencia.query;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class QDtoDetallePropuestaOfertaLaboralAdministrador {
    private UUID uuid;
    private UUID uuidOferta;
    private String tituloOferta;
    private String cargoOferta;
    private String estatus;
    private UUID uuidEmpresa;
    private String nombreEmpresa;
    private UUID uuidEmpleado;
    private String primerNombreEmpleado;
    private String primerApellidoEmpleado;
    private String comentario;
}
