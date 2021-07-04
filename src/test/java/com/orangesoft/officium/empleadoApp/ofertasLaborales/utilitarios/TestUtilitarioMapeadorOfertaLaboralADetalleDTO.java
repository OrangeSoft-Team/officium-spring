package com.orangesoft.officium.empleadoApp.ofertasLaborales.utilitarios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorOfertaLaboralADetalleDTO;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorOfertaLaboralADetalleDTOImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;

public class TestUtilitarioMapeadorOfertaLaboralADetalleDTO {
    private final MapeadorOfertaLaboralADetalleDTO mapeadorOfertaLaboralADetalleDTO;
    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUtilitarioMapeadorOfertaLaboralADetalleDTO() {
        mapeadorOfertaLaboralADetalleDTO = new MapeadorOfertaLaboralADetalleDTOImpl();
        ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeConvertirEmpresaYOfertaLaboralEnDTODetalleOfertaLaboral() {
        Tupla<Empresa, OfertaLaboral> ofertaLaboralTupla = ofertaLaboralEmpleadoMother.obtenerEmpresaOfertaLaboralPython();
        DtoDetalleOfertaLaboralActivaEmpleado dtoDetalleOfertaLaboralActivaEmpleadoEsperado = ofertaLaboralEmpleadoMother.obtenerDtoDetallesOfertaLaboralPython();
        DtoDetalleOfertaLaboralActivaEmpleado dtoDetalleOfertaLaboralActivaEmpleadoObtenido = mapeadorOfertaLaboralADetalleDTO.mapOfertaLaboralADetalleDto(ofertaLaboralTupla.getFirstElement(),ofertaLaboralTupla.getSecondElement());
        assert(dtoDetalleOfertaLaboralActivaEmpleadoEsperado.equals(dtoDetalleOfertaLaboralActivaEmpleadoObtenido));
    }
}
