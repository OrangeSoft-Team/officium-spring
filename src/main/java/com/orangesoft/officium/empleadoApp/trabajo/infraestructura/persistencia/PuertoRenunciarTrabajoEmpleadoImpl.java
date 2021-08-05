package com.orangesoft.officium.empleadoApp.trabajo.infraestructura.persistencia;

import com.orangesoft.officium.empleadoApp.trabajo.aplicacion.salida.PuertoRenunciarTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.dominio.values.IdTrabajoEmpleado;
import com.orangesoft.officium.empleadoApp.trabajo.infraestructura.persistencia.repositorio.RepositorioTrabajoActivos;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoRenunciarTrabajoEmpleadoImpl implements PuertoRenunciarTrabajoEmpleado {
    @Autowired
    RepositorioTrabajoActivos repositorioTrabajoActivos;

    @Override
    public void renunciarTrabajoEmpleado(IdTrabajoEmpleado idTrabajoEmpleado) {
        repositorioTrabajoActivos.deleteById(idTrabajoEmpleado.getUuid());
    }
}
