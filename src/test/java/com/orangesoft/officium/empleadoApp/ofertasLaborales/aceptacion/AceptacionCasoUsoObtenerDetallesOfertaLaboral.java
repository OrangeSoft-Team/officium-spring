package com.orangesoft.officium.empleadoApp.ofertasLaborales.aceptacion;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AceptacionCasoUsoObtenerDetallesOfertaLaboral {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void debeRetornarErrorServidorPorMalUUID() throws Exception {
        Exception resul = null;
        String errorEsperado = "org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.RuntimeException: El identificador suministrado no cumple con el formato esperado";
        try {
            mockMvc.perform(get("/api/empleado/ofertas_laborales/sawe12313123"));
        }
        catch (Exception e) {
            resul=e;
            System.out.println(e.toString());
        }
        assert(resul != null);
        assert(resul.toString().equals(errorEsperado));
    }

    @Test
    public void debeRetornarErrorServidorPorMalNoEncontrarOfertaLaboral() throws Exception {
        Exception resul = null;
        String errorEsperado = "org.springframework.web.util.NestedServletException: Request processing failed; nested exception is com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada: La oferta laboral solicitada no existe";
        try {
            mockMvc.perform(get("/api/empleado/ofertas_laborales/0000d69e-0000-0000-0000-000000000000"));
        }
        catch (Exception e){
            resul = e;
        }
        assert(resul != null);
        assert(resul.toString().equals(errorEsperado));
    }
}
