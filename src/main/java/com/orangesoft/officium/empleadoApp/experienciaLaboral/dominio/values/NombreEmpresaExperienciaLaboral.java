package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values;

import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionNombreEmpresaExperienciaLaboralNula;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class NombreEmpresaExperienciaLaboral {
    private String nombreEmpresa;

    public NombreEmpresaExperienciaLaboral(String nombreEmpresa) {
        if(nombreEmpresa == null)
            throw new ExcepcionNombreEmpresaExperienciaLaboralNula();
        this.nombreEmpresa = nombreEmpresa;
    }
}
