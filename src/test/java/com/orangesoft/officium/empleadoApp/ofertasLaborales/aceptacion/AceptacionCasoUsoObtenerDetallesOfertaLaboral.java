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
    public void debeRetornarErrorServidorNoAuntentificadoOfertas() throws Exception {
        mockMvc.perform(get("/api/empleado/ofertas_laborales/sawe12313123")).andDo(print())
                    .andExpect(status().isUnauthorized()); //HTTP 401
    }

    @Test
    public void debeRetornarErrorServidorNotAutentificado() throws Exception {
            mockMvc.perform(get("/api/empleado/ofertas_laborales/0000d69e-0000-0000-0000-000000000000"))
                    .andExpect(status().isUnauthorized()); //HTTP 401
    }
}
