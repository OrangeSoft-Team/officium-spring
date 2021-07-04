package com.orangesoft.officium.empleadoApp.ofertasLaborales.unitarios;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.CasoUsoConsultarDetallesOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoListaOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import lombok.AllArgsConstructor;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class TestUnitarioCasoUsoConsultarDetallesOfertaLaboral {

    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUnitarioCasoUsoConsultarDetallesOfertaLaboral() {
        this.ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeRetornarExpcionCuandoOferaLaboralNoEncontrada() {
        PuertoDetallesOfertaLaboral puertoDetallesOfertaLaboral = Mockito.mock(PuertoDetallesOfertaLaboral.class);
        when(puertoDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(new IdOfertaLaboral(ofertaLaboralEmpleadoMother.getOfertaUUID().toString())))
                .thenReturn(null);
        CasoUsoConsultarDetallesOfertaLaboral consultarDetallesOfertaLaboral = new CasoUsoConsultarDetallesOfertaLaboralImpl(puertoDetallesOfertaLaboral);
        String mensajeEsperado = "com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada: La oferta laboral solicitada no existe";
        Exception espearada = null;
        try {
            consultarDetallesOfertaLaboral.consultarDetallesOfertaLaboral(new IdOfertaLaboral(ofertaLaboralEmpleadoMother.getOfertaUUID().toString()));
        }catch (Exception e) {
            espearada = e;
        }
        assert(espearada != null);
        assert(mensajeEsperado.equals(espearada.toString()));
    }

}
