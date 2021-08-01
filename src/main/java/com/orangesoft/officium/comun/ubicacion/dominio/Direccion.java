package com.orangesoft.officium.comun.ubicacion.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionCalleUnoDireccionNula;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionCodigoPostalDireccionNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdCiudadNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdDireccionNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Direccion {
    private IdDireccion idDireccion;
    private CalleUnoDireccion calleUnoDireccion;
    private CalleDosDireccion calleDosDireccion;
    private CodigoPostalDireccion codigoPostalDireccion;
    private IdCiudad idCiudad;

    public Direccion(IdDireccion idDireccion,
                     CalleUnoDireccion calleUnoDireccion,
                     CalleDosDireccion calleDosDireccion,
                     CodigoPostalDireccion codigoPostalDireccion,
                     IdCiudad idCiudad) {
        this.idDireccion = idDireccion;
        this.calleUnoDireccion = calleUnoDireccion;
        this.calleDosDireccion = calleDosDireccion;
        this.codigoPostalDireccion = codigoPostalDireccion;
        this.idCiudad = idCiudad;
        validarDireccion();
    }

    private void validarDireccion() {
        if(idDireccion == null)
            throw new ExcepcionIdDireccionNulo();
        if(calleUnoDireccion == null)
            throw new ExcepcionCalleUnoDireccionNula();
        if(codigoPostalDireccion == null)
            throw new ExcepcionCodigoPostalDireccionNulo();
        if(idCiudad == null)
            throw new ExcepcionIdCiudadNulo();
    }
}
