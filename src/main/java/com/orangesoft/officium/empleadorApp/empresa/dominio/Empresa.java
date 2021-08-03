package com.orangesoft.officium.empleadorApp.empresa.dominio;

import com.orangesoft.officium.empleadorApp.direccion.Direccion;
import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.*;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.*;

import com.orangesoft.officium.empleadorApp.habilidad.Excepciones.ExcepcionNombreHabilidadNoNull;
import com.orangesoft.officium.empleadorApp.habilidad.Habilidad;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.opinion.Opinion;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.management.Notification;
import java.util.List;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class Empresa {
    private IdEmpresa idEmpresa;
    private NombreEmpresa nombreEmpresa;
    private CorreoElectronicoEmpresa correoElectronicoEmpresa;
    private DireccionEmpresa direccionEmpresa;
    private List<DelegadoEmpresa> delegado;
    private EstadoEmpresa estadoEmpresa;
    private List<Habilidad> habilidad;
    private List<Opinion> opinion;
    private List<Notificacion> notification;
    private List<OfertaLaboral> ofertaLaborals;
    private RequisitosEspeciales requisitosEspeciales;


    public Empresa(IdEmpresa idEmpresa,
             NombreEmpresa nombreEmpresa,
             CorreoElectronicoEmpresa correoElectronicoEmpresa,
            DireccionEmpresa direccionEmpresa,
            List<DelegadoEmpresa> delegado,
            EstadoEmpresa estadoEmpresa,
              List<Habilidad> habilidad,
             List<Opinion> opinion,
             List<Notificacion> notification,
            List<OfertaLaboral> ofertaLaboral,
            RequisitosEspeciales requisitosEspeciales)

    { validarEmpresa();
        this.idEmpresa=idEmpresa;
        this.nombreEmpresa=nombreEmpresa;
        this.correoElectronicoEmpresa=correoElectronicoEmpresa;
        this.direccionEmpresa=direccionEmpresa;
        this.delegado=delegado;
        this.estadoEmpresa=estadoEmpresa;
        this.habilidad=habilidad;
        this.opinion=opinion;
        this.notification=notification;
        this.requisitosEspeciales=requisitosEspeciales;
    }

    public void validarEmpresa() {
        if(idEmpresa == null)
            throw new ExcepcionIdEmpresaNulo();
        if(nombreEmpresa == null)
            throw new ExcepcionNombreEmpresaNulo();
        if(correoElectronicoEmpresa == null)
            throw new ExcepcionCorreoElectronicoEmpresaNulo();
        if(direccionEmpresa == null)
            throw new ExcepcionDireccionEmpresaNula();
        if(habilidad == null)
            throw new ExcepcionNombreHabilidadNoNull();

    }



}
