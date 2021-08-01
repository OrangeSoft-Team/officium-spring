package com.orangesoft.officium.empleadoApp.empleado.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.Direccion;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdEstadoNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.empleadoApp.empleado.dominio.excepciones.*;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.*;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.ExcepcionIdEmpresaNulo;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.ExperienciaLaboral;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaPublicacionOfertaLaboralNula;
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
public class Empleado {
    // Informacion del empleado
    private IdEmpleado idEmpleado;
    private NombreCompletoEmpleado nombreCompletoEmpleado;
    private CorreoElectronicoEmpleado correoElectronicoEmpleado;
    private NumeroTelefonicoEmpleado numeroTelefonicoEmpleado;
    private NivelEducativoEmpleado nivelEducativoEmpleado;
    private EstatusEmpleado estatusEmpleado;
    private GeneroEmpleado generoEmpleado;
    private FechaNacimientoEmpleado fechaNacimientoEmpleado;

    // Agregados
    private Direccion direccionEmpleado;
    private List<ExperienciaLaboral> experienciasLaborales;
    private List<Habilidad> habilidades;

    public Empleado(IdEmpleado idEmpleado,
                    NombreCompletoEmpleado nombreCompletoEmpleado,
                    CorreoElectronicoEmpleado correoElectronicoEmpleado,
                    NumeroTelefonicoEmpleado numeroTelefonicoEmpleado,
                    NivelEducativoEmpleado nivelEducativoEmpleado,
                    EstatusEmpleado estatusEmpleado,
                    GeneroEmpleado generoEmpleado,
                    FechaNacimientoEmpleado fechaNacimientoEmpleado,
                    Direccion direccionEmpleado,
                    List<ExperienciaLaboral> experienciasLaborales,
                    List<Habilidad> habilidades) {
        this.idEmpleado = idEmpleado;
        this.nombreCompletoEmpleado = nombreCompletoEmpleado;
        this.correoElectronicoEmpleado = correoElectronicoEmpleado;
        this.numeroTelefonicoEmpleado = numeroTelefonicoEmpleado;
        this.nivelEducativoEmpleado = nivelEducativoEmpleado;
        this.estatusEmpleado = estatusEmpleado;
        this.generoEmpleado = generoEmpleado;
        this.fechaNacimientoEmpleado = fechaNacimientoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        if(experienciasLaborales == null)
            experienciasLaborales = new ArrayList<>();
        this.experienciasLaborales = experienciasLaborales;
        if(habilidades == null)
            habilidades = new ArrayList<>();
        this.habilidades = habilidades;
        validarEmpleado();
    }

    private void validarEmpleado(){
        if(idEmpleado == null)
            throw new ExcepcionIdEmpresaNulo();
        if(nombreCompletoEmpleado == null)
            throw new ExcepcionPrimerNombreEmpleadoNulo();
        if(correoElectronicoEmpleado == null)
            throw new ExcepcionCorreoElectronicoEmpleadoNulo();
        if(numeroTelefonicoEmpleado == null)
            throw new ExcepcionNumeroTelefonicoEmpleadoNulo();
        if(nivelEducativoEmpleado == null)
            throw new ExcepcionNivelEducativoEmpleadoNulo();
        if(estatusEmpleado == null)
            throw new ExcepcionEstatusEmpleadoNulo();
        if(generoEmpleado == null)
            throw new ExcepcionGeneroEmpleadoNulo();
        if(fechaNacimientoEmpleado == null)
            throw new ExcepcionFechaNacimientoEmpleadoInvalida();
        if(direccionEmpleado == null)
            throw new ExcepcionDireccionEmpleadoNula();
    }
}
