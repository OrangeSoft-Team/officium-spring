package com.orangesoft.officium.empleadoApp.ofertasLaborales.utilitarios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorQDTOAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorQDTOAOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;

public class TestUtilitarioMapeadorQDTOAOfertaLaboral {
    private final MapeadorQDTOAOfertaLaboral mapeadorQDTOAOfertaLaboral;
    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUtilitarioMapeadorQDTOAOfertaLaboral() {
        this.mapeadorQDTOAOfertaLaboral = new MapeadorQDTOAOfertaLaboralImpl();
        this.ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeConvertirQDTOAEntidadOfertaLaboral() {
        QDtoOfertasLaboralesActivas qDtoOfertasLaboralesActivas = ofertaLaboralEmpleadoMother.obtenerQDTOOfertaLaboralPython();
        Tupla<NombreEmpresa, OfertaLaboral> ofertaLaboralTuplaEsperado = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython();
        OfertaLaboral ofertaLaboralTuplaObtenido = mapeadorQDTOAOfertaLaboral.PersistenciaAOfertaLaboral(qDtoOfertasLaboralesActivas);
        System.out.println("Resultados: debeConvertirQDTOAEntidadOfertaLaboral");
        System.out.println(ofertaLaboralTuplaEsperado.toString());
        System.out.println(ofertaLaboralTuplaObtenido.toString());
        System.out.println("\n\n");

        assert(!ofertaLaboralTuplaObtenido.equals(ofertaLaboralTuplaEsperado.getSecondElement()));
    }
}
