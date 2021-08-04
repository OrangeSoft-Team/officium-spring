package com.orangesoft.officium.empleadoApp.trabajo.infraestructura;

import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ComandosTrabajo;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.CQRS.ConsultasTrabajo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ControladorTrabajos {
    @Autowired
    ComandosTrabajo comandosTrabajo;
    @Autowired
    ConsultasTrabajo consultasTrabajo;
}
