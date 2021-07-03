package com.orangesoft.officium.empleadorApp.empresa.dominio;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.*;
import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.*;
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
    private DireccionEmpresa direccionEmpresa;
    private CodigoPostalEmpresa codigoPostalEmpresa;
    private IdPais idPaisEmpresa;
    private IdEstado idEstadoEmpresa;
    private IdCiudad idCiudadEmpresa;

    public Empresa(IdEmpresa idEmpresa,
                   NombreEmpresa nombreEmpresa,
                   CorreoElectronicoEmpresa correoElectronicoEmpresa,
                   DireccionEmpresa direccionEmpresa,
                   CodigoPostalEmpresa codigoPostalEmpresa,
                   IdPais idPaisEmpresa,
                   IdEstado idEstadoEmpresa,
                   IdCiudad idCiudadEmpresa) {
        validarEmpresa();
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.correoElectronicoEmpresa = correoElectronicoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.codigoPostalEmpresa = codigoPostalEmpresa;
        this.idPaisEmpresa = idPaisEmpresa;
        this.idEstadoEmpresa = idEstadoEmpresa;
        this.idCiudadEmpresa = idCiudadEmpresa;}

    public void validarEmpresa() {
        if(idEmpresa == null)
            throw new ExcepcionIdEmpresaNulo();
        if(nombreEmpresa == null)
            throw new ExcepcionNombreEmpresaNulo();
        if(correoElectronicoEmpresa == null)
            throw new ExcepcionCorreoElectronicoEmpresaNulo();
        if(direccionEmpresa == null)
            throw new ExcepcionDireccionEmpresaNula();
        if(codigoPostalEmpresa == null)
            throw new ExcepcionCorreoElectronicoEmpresaNulo();
        if(idPaisEmpresa == null)
            throw new ExcepcionIdPaisNulo();
        if(idEstadoEmpresa == null)
            throw new ExcepcionIdEstadoNulo();
        if(idCiudadEmpresa == null)
            throw new ExcepcionIdCiudadNulo();
    }



}
