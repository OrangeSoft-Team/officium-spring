package com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.dominio.postulacionOfertaLaboral.EnumEstatusPostulacionOfertaLaboral;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empleado.dominio.Empleado;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.IdEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionEmpleadoNoEncontrado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEsDeEsaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoValidarPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionFechaPublicacionOfertaLaboralNula;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.ExcepcionNoSePuedeRepostularOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.Exepciones.ExcepcionPostulacionOfertaLaboralInvalida;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Component
@AllArgsConstructor
public class CasoUsoAplicarOfertaLaboralImpl implements CasoUsoAplicarOfertaLaboral {
    @Autowired
    private final PuertoAplicarOfertaLaboral puertoAplicarOfertaLaboral;
    @Autowired
    private final PuertoValidarPostulacionOfertaLaboral puertoValidarPostulacionOfertaLaboral;


    @Override
    public void aplicarOfertaLaboral(IdEmpleado idEmpleado, IdEmpresa idEmpresa, IdOfertaLaboral idOfertaLaboral, ComentarioPostulacionOfertaLaboral comentarioPostulacionOfertaLaboral) {
        Tupla<OfertaLaboral, Empleado> ofertaLaboralEmpleadoTupla = puertoValidarPostulacionOfertaLaboral.validarPostulacionOfertaLaboral(idEmpleado, idEmpresa, idOfertaLaboral);
        validarSolicitudOfertaLaboral(idEmpleado,idEmpresa,idOfertaLaboral,ofertaLaboralEmpleadoTupla);

        System.out.println(idEmpleado.toString());
        PostulacionOfertaLaboral postulacionOfertaLaboral = new PostulacionOfertaLaboral(
                new IdPostulacionOfertaLaboral(UUID.randomUUID()),
                new FechaPostulacionOfertaLaboral(Instant.now()),
                new EstadoPostulacionOfertaLaboral(EnumEstatusPostulacionOfertaLaboral.EN_PROCESO),
                idOfertaLaboral,
                idEmpleado,
                comentarioPostulacionOfertaLaboral
        );

        puertoAplicarOfertaLaboral.aplicarOfertaLaboral(postulacionOfertaLaboral);
    }

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
        if(ofertaLaboral.getFechaPublicacionOfertaLaboral().getFechaLimitePostulacion().isBefore(Instant.now()) ||
        ofertaLaboral.getNumeroVacantes().getNumeroVacantes() == 0 ||
        !ofertaLaboral.getEstadoOfertaLaboral().getEstadoOfertaLaboral().equals(EnumEstatusOfertaLaboral.PUBLICADO))
            throw new ExcepcionPostulacionOfertaLaboralInvalida();
        PostulacionOfertaLaboral postulacionOfertaLaboral = puertoValidarPostulacionOfertaLaboral.validarSiYaSePostuloElEmpleado(idEmpleado, idOfertaLaboral);
        if(postulacionOfertaLaboral != null)
            throw new ExcepcionNoSePuedeRepostularOfertaLaboral();
    }
}
