package com.orangesoft.officium.empleadoApp.empresa.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.Direccion;
import com.orangesoft.officium.empleadoApp.empresa.dominio.excepciones.*;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.*;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.exepciones.ExcepcionRequisitosEspecialesOfertaLaboralInvalidos;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.RequisitosEspecialesOfertaLaboral;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class Empresa {
    private IdEmpresa idEmpresa;
    private NombreEmpresa nombreEmpresa;
    private CorreoElectronicoEmpresa correoElectronicoEmpresa;
    private EstatusEmpresa estatusEmpresa;
    private RequisitosEspecialesEmpresa requisitosEspecialesEmpresa;

    // Agregado
    private Direccion direccionEmpresa;

    public Empresa(IdEmpresa idEmpresa,
                   NombreEmpresa nombreEmpresa,
                   CorreoElectronicoEmpresa correoElectronicoEmpresa,
                   EstatusEmpresa estatusEmpresa,
                   RequisitosEspecialesEmpresa requisitosEspecialesEmpresa,
                   Direccion direccionEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.correoElectronicoEmpresa = correoElectronicoEmpresa;
        this.estatusEmpresa = estatusEmpresa;
        this.requisitosEspecialesEmpresa = requisitosEspecialesEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        validarEmpresa();
    }

    public void validarEmpresa() {
        if(idEmpresa == null)
            throw new ExcepcionIdEmpresaNulo();
        if(nombreEmpresa == null)
            throw new ExcepcionNombreEmpresaNulo();
        if(correoElectronicoEmpresa == null)
            throw new ExcepcionCorreoElectronicoEmpresaNulo();
        if(estatusEmpresa == null)
            throw new ExcepcionEstatusEmpresaNulo();
        if(requisitosEspecialesEmpresa == null)
            requisitosEspecialesEmpresa = new RequisitosEspecialesEmpresa(null);
        if(direccionEmpresa == null)
            throw new ExcepcionDireccionEmpresaNula();
    }
}
