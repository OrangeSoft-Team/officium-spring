package com.orangesoft.officium.comun.ubicacion.dominio;

import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionIdPaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.excepciones.ExcepcionNombrePaisNulo;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombrePais;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Pais {
    private IdPais idPais;
    private NombrePais nombrePais;

    public Pais(IdPais idPais, NombrePais nombrePais) {
        if(idPais == null)
            throw new ExcepcionIdPaisNulo();
        if(nombrePais == null)
            throw new ExcepcionNombrePaisNulo();
        this.idPais = idPais;
        this.nombrePais = nombrePais;
    }
}
