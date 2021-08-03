package com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio;

import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionCargoExperienciaLaboralNula;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionFechaInicioExperenciaLaboralInvalida;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionIdExperienciaLaboralNulo;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.excepciones.ExcepcionNombreEmpresaExperienciaLaboralNula;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values.CargoExperienciaLaboral;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values.IdExperienciaLaboral;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values.NombreEmpresaExperienciaLaboral;
import com.orangesoft.officium.empleadoApp.experienciaLaboral.dominio.values.RangoFechaExperienciaLaboral;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class ExperienciaLaboral {
    private IdExperienciaLaboral idExperienciaLaboral;
    private CargoExperienciaLaboral cargoExperienciaLaboral;
    private NombreEmpresaExperienciaLaboral nombreEmpresaOfertaLaboral;
    private RangoFechaExperienciaLaboral rangoFechaExperienciaLaboral;


    public ExperienciaLaboral(IdExperienciaLaboral idExperienciaLaboral,
                              CargoExperienciaLaboral cargoExperienciaLaboral,
                              NombreEmpresaExperienciaLaboral nombreEmpresaOfertaLaboral,
                              RangoFechaExperienciaLaboral rangoFechaExperienciaLaboral) {
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.cargoExperienciaLaboral = cargoExperienciaLaboral;
        this.nombreEmpresaOfertaLaboral = nombreEmpresaOfertaLaboral;
        this.rangoFechaExperienciaLaboral = rangoFechaExperienciaLaboral;
        validarExperienciaLaboral();
    }

    private void validarExperienciaLaboral() {
        if(idExperienciaLaboral == null)
            throw new ExcepcionIdExperienciaLaboralNulo();
        if(cargoExperienciaLaboral == null)
            throw new ExcepcionCargoExperienciaLaboralNula();
        if(nombreEmpresaOfertaLaboral == null)
            throw new ExcepcionNombreEmpresaExperienciaLaboralNula();
        if(rangoFechaExperienciaLaboral == null)
            throw new ExcepcionFechaInicioExperenciaLaboralInvalida();
    }
}
