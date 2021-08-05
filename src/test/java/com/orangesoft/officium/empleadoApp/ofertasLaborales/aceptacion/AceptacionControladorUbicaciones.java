package com.orangesoft.officium.empleadoApp.ofertasLaborales.aceptacion;

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
public class AceptacionControladorUbicaciones {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void debeRetornarSolicitudAprobadaPaises() throws Exception {
        mockMvc.perform(get("/api/ubicacion/paises/")).andDo(print())
                .andExpect(status().isOk()); //HTTP 200
    }

    @Test
    public void debeRetornarSolicitudAprobadaEstados() throws Exception {
        mockMvc.perform(get("/api/ubicacion/paises/7a424dee-7e50-4a01-ab6e-a09201677819/estados")).andDo(print())
                .andExpect(status().isOk()); //HTTP 200
    }
    @Test
    public void debeRetornarSolicitudAprobadaCiudades() throws Exception {
        mockMvc.perform(get("/api/ubicacion/paises/7a424dee-7e50-4a01-ab6e-a09201677818/estados/23450ac5-23f6-4e4a-b2ab-4da5aee82070/ciudades")).andDo(print())
                .andExpect(status().isOk()); //HTTP 200
    }
}
