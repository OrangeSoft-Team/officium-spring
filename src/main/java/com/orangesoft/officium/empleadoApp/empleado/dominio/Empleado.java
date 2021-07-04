package com.orangesoft.officium.empleadoApp.empleado.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.*;

public class Empleado {
    private IdEmpleado idEmpleado;
    private CorreoElectronicoEmpleado correoElectronicoEmpleado;
    private NombreEmpleado nombreEmpleado;
    private GeneroEmpleado generoEmpleado;
    private NumeroTelefonicoEmpleado numeroTelefonicoEmpleado;
    private FechaNacimientoEmpleado fechaNacimientoEmpleado;
    private ActivoEmpleado activoEmpleado;
    private IdPais idPais;
    private IdEstado idEstado;
    private IdCiudad idCiudad;
}
