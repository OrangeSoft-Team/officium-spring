package com.orangesoft.officium.empleadoApp.ofertasLaborales.aceptacion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AceptacionCasoUsoObtenerListaOfertasLaboralesActivasEmpleado {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void debeRetornarUsuarioNoAutorizado() throws Exception {
        mockMvc.perform(get("/api/empleado/ofertas_laborales/"))
                .andDo(print())
                .andExpect(status().isUnauthorized()); // HTTP 401
    }
}
