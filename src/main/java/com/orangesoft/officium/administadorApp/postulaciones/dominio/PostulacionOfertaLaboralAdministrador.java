package com.orangesoft.officium.administadorApp.postulaciones.dominio;

import com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects.IdEmpleado;
import com.orangesoft.officium.administadorApp.empleado.dominio.valueObjects.NombreEmpleado;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.excepciones.ExcepcionCampoNulo;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.CargoOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.TituloOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.ComentarioPostulacionOfertaLaboral;
import com.orangesoft.officium.administadorApp.postulaciones.dominio.valueObjects.IdPostulacionOfertaLaboral;
import com.orangesoft.officium.comun.dominio.postulacionOfertaLaboral.EnumEstatusPostulacionOfertaLaboral;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
//@Builder
@Getter
@Setter
public class PostulacionOfertaLaboralAdministrador {
    private IdPostulacionOfertaLaboral idPostulacion;
    private IdOfertaLaboral idOfertaLaboral;
    private TituloOfertaLaboral tituloOfertaLaboral;
    private CargoOfertaLaboral cargoOfertaLaboral;
    private EnumEstatusPostulacionOfertaLaboral estatusPostulacionOfertaLaboral;
    private IdEmpresa idEmpresa;
    private NombreEmpresa nombreEmpresa;
    private IdEmpleado idEmpleado;
    private NombreEmpleado nombreEmpleado;
    private ComentarioPostulacionOfertaLaboral comentarioPostulacion;

    public PostulacionOfertaLaboralAdministrador(
            IdPostulacionOfertaLaboral idPostulacion,
            IdOfertaLaboral idOfertaLaboral,
            TituloOfertaLaboral tituloOfertaLaboral,
            CargoOfertaLaboral cargoOfertaLaboral,
            EnumEstatusPostulacionOfertaLaboral estatusPostulacionOfertaLaboral,
            IdEmpresa idEmpresa,
            NombreEmpresa nombreEmpresa,
            IdEmpleado idEmpleado,
            NombreEmpleado nombreEmpleado,
            ComentarioPostulacionOfertaLaboral comentarioPostulacion) {
        if (idPostulacion == null) {
            throw new ExcepcionCampoNulo("id postulacion");
        }
        if (idOfertaLaboral == null) {
            throw new ExcepcionCampoNulo("id oferta laboral");
        }
        if (tituloOfertaLaboral == null) {
            throw new ExcepcionCampoNulo("titulo oferta laboral");
        }
        if (cargoOfertaLaboral == null) {
            throw new ExcepcionCampoNulo("cargo oferta laboral");
        }
        if (estatusPostulacionOfertaLaboral == null) {
            throw new ExcepcionCampoNulo("estatus postulacion");
        }
//        if (idEmpresa == null) {
//            throw new ExcepcionCampoNulo("id empresa");
//        }
        if (nombreEmpresa == null) {
            throw new ExcepcionCampoNulo("nombre empresa");
        }
//        if (idEmpleado == null) {
//            throw new ExcepcionCampoNulo("id empleado");
//        }
        if (nombreEmpleado == null) {
            throw new ExcepcionCampoNulo("nombre empleado");
        }
        this.idPostulacion = idPostulacion;
        this.idOfertaLaboral = idOfertaLaboral;
        this.tituloOfertaLaboral = tituloOfertaLaboral;
        this.cargoOfertaLaboral = cargoOfertaLaboral;
        this.estatusPostulacionOfertaLaboral = estatusPostulacionOfertaLaboral;
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.comentarioPostulacion = comentarioPostulacion;
    }
}
