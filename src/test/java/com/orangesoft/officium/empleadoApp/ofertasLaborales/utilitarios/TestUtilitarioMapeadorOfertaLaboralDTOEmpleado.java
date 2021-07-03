package com.orangesoft.officium.empleadoApp.ofertasLaborales.utilitarios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorOfertaLaboralDTO;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorOfertaLaboralDTOImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;

public class TestUtilitarioMapeadorOfertaLaboralDTOEmpleado {
    private final MapeadorOfertaLaboralDTO mapeadorOfertaLaboralDTO;
    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUtilitarioMapeadorOfertaLaboralDTOEmpleado() {
        mapeadorOfertaLaboralDTO = new MapeadorOfertaLaboralDTOImpl();
        ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeConvertirOfertaLaboralADtoOfertaLaboral() {
        DtoOfertasLaboralesActivasEmpleado dtoOfertaLaboralDeseado = ofertaLaboralEmpleadoMother.obtenerDtoOfertaLaboralPython();
        Tupla<NombreEmpresa, OfertaLaboral> tuplaOfertaLaboral = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython();
        DtoOfertasLaboralesActivasEmpleado dtoOfertaLaboralObtenido = mapeadorOfertaLaboralDTO.mapOfertaLaboralADto(tuplaOfertaLaboral.getFirstElement(), tuplaOfertaLaboral.getSecondElement());
        System.out.println("Resultados: debeConvertirOfertaLaboralADtoOfertaLaboral");
        System.out.println(dtoOfertaLaboralDeseado.toString());
        System.out.println(dtoOfertaLaboralObtenido.toString());
        System.out.println("\n\n");
        assert(dtoOfertaLaboralDeseado.equals(dtoOfertaLaboralObtenido));
    }

    @Test
    public void debeConvertirPeroNoSerIgualOfertaLaboralADtoOfertaLaboral() {
        DtoOfertasLaboralesActivasEmpleado dtoOfertaLaboralDiferente = ofertaLaboralEmpleadoMother.obtenerDtoOfertaLaboralJava();
        Tupla<NombreEmpresa, OfertaLaboral> tuplaOfertaLaboral = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython();
        DtoOfertasLaboralesActivasEmpleado dtoOfertaLaboralObtenido = mapeadorOfertaLaboralDTO.mapOfertaLaboralADto(tuplaOfertaLaboral.getFirstElement(), tuplaOfertaLaboral.getSecondElement());
        System.out.println("Resultados: debeConvertirPeroNoSerIgualOfertaLaboralADtoOfertaLaboral");
        System.out.println(dtoOfertaLaboralDiferente.toString());
        System.out.println(dtoOfertaLaboralObtenido.toString());
        System.out.println("\n\n");
        assert(!dtoOfertaLaboralDiferente.equals(dtoOfertaLaboralObtenido));
    }

    @Test
    public void debeConvertirYSerIgualToStringOfertaLaboralADtoOfertaLaboral() {
        String esperado = ofertaLaboralEmpleadoMother.obtenerDtoOfertaLaboralJava().toString();
        Tupla<NombreEmpresa, OfertaLaboral> tuplaOfertaLaboral = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralJava();
        DtoOfertasLaboralesActivasEmpleado dtoOfertaLaboralObtenido = mapeadorOfertaLaboralDTO.mapOfertaLaboralADto(tuplaOfertaLaboral.getFirstElement(), tuplaOfertaLaboral.getSecondElement());
        System.out.println("Resultados: debeConvertirYSerIgualToStringOfertaLaboralADtoOfertaLaboral");
        System.out.println(esperado);
        System.out.println(dtoOfertaLaboralObtenido.toString()+"\n\n\n");
        assert(esperado.equals(dtoOfertaLaboralObtenido.toString()));
    }
}
