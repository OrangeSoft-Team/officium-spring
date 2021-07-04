package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.estadoOfertaLaboral.dominio.EnumEstadoPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionEmpleadoNoEncontrado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEsDeEsaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoValidarPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.ComentarioOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.EstadoPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.FechaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.PuertoDetallesOfertaLaboralImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class CasoUsoAplicarOfertaLaboralImpl implements CasoUsoAplicarOfertaLaboral {
    @Autowired
    private PuertoAplicarOfertaLaboral puertoAplicarOfertaLaboral;
    @Autowired
    private PuertoValidarPostulacionOfertaLaboral puertoValidarPostulacionOfertaLaboral;


    @Override
    public void aplicarOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral) {
        Tupla<OfertaLaboral, Empleado> ofertaLaboralEmpleadoTupla = puertoValidarPostulacionOfertaLaboral.validarPostulacionOfertaLaboral(idEmpleado, idEmpresa, idOfertaLaboral);
        validarSolicitudOfertaLaboral(idEmpleado,idEmpresa,idOfertaLaboral,ofertaLaboralEmpleadoTupla);

        PostulacionOfertaLaboral postulacionOfertaLaboral = new PostulacionOfertaLaboral(
                idEmpresa,
                idOfertaLaboral,
                idEmpleado,
                new FechaPostulacionOfertaLaboral(Instant.now()),
                new ComentarioOfertaLaboral(null),
                new EstadoPostulacionOfertaLaboral(EnumEstadoPostulacionOfertaLaboral.PROCESO)
        );
        puertoAplicarOfertaLaboral.aplicarOfertaLaboral(postulacionOfertaLaboral);
    }

    // TODO: Evaluar abstracción por composición de un validador de reglas de negocio
    private void validarSolicitudOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral,  Tupla<OfertaLaboral, Empleado> ofertaLaboralEmpleadoTupla) {
        if(ofertaLaboralEmpleadoTupla == null)
            throw new ExcepcionOfertaLaboralNoEncontrada();
        OfertaLaboral ofertaLaboral = ofertaLaboralEmpleadoTupla.getFirstElement();
        Empleado empleado = ofertaLaboralEmpleadoTupla.getSecondElement();
        if(ofertaLaboral == null)
            throw new ExcepcionOfertaLaboralNoEncontrada();
        if(empleado == null)
            throw new ExcepcionEmpleadoNoEncontrado();
        if(!ofertaLaboral.getIdEmpresa().equals(idEmpresa))
            throw new ExcepcionOfertaLaboralNoEsDeEsaEmpresa();
    }
}
