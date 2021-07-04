package com.orangesoft.officium.empleadoApp.empleado.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionActivoEmpleadoNulo;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionCorreoElectronicoEmpleadoNulo;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionGeneroEmpleadoNulo;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.ExcepcionPrimerNombreEmpleadoNulo;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.*;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaPublicacionOfertaLaboralNula;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
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

    public Empleado(IdEmpleado idEmpleado,
                    CorreoElectronicoEmpleado correoElectronicoEmpleado,
                    NombreEmpleado nombreEmpleado,
                    GeneroEmpleado generoEmpleado,
                    NumeroTelefonicoEmpleado numeroTelefonicoEmpleado,
                    FechaNacimientoEmpleado fechaNacimientoEmpleado,
                    ActivoEmpleado activoEmpleado,
                    IdPais idPais,
                    IdEstado idEstado,
                    IdCiudad idCiudad) {
        this.idEmpleado = idEmpleado;
        this.correoElectronicoEmpleado = correoElectronicoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.generoEmpleado = generoEmpleado;
        this.numeroTelefonicoEmpleado = numeroTelefonicoEmpleado;
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
        this.activoEmpleado = activoEmpleado;
        this.idPais = idPais;
        this.idEstado = idEstado;
        this.idCiudad = idCiudad;
        validarEmpleado();
    }

    private void validarEmpleado(){
        if(idEmpleado==null)
            throw new ExcepcionIdEmpresaNulo();
        if(correoElectronicoEmpleado==null)
            throw new ExcepcionCorreoElectronicoEmpleadoNulo();
        if(nombreEmpleado==null)
            throw new ExcepcionPrimerNombreEmpleadoNulo();
        if(generoEmpleado==null)
            throw new ExcepcionGeneroEmpleadoNulo();
        if(fechaNacimientoEmpleado==null)
            throw new ExcepcionFechaPublicacionOfertaLaboralNula();
        if(activoEmpleado==null)
            throw new ExcepcionActivoEmpleadoNulo();
        if(idPais==null)
            throw new ExcepcionIdPaisNulo();
        if(idEstado==null)
            throw new ExcepcionIdEstadoNulo();
        if(idCiudad==null)
            throw new ExcepcionIdCiudadNulo();
    }
}
