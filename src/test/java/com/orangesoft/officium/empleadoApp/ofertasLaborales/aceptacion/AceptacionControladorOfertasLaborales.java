package com.orangesoft.officium.empleadoApp.ofertasLaborales.aceptacion;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoAplicarOfertaLaboralEmpleadoEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoDetalleOfertaLaboralActivaEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class AceptacionControladorOfertasLaborales {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void debeRetornarSolicitudDenegadaListaOfertasLaborales() throws Exception {
        mockMvc.perform(get("/api/empleado/ofertas_laborales/")).andDo(print())
                .andExpect(status().isUnauthorized()); //HTTP 401
    }

    @Test
    public void debeRetornarSolicitudDenegadaDetalleOfertasLaborales() throws Exception {
        mockMvc.perform(get("/api/empleado/ofertas_laborales/7a424dee-7e50-4a01-ab6e-a09201677819")).andDo(print())
                .andExpect(status().isUnauthorized()); //HTTP 401
    }
    
    @Test
    public void debeRetornarSolicitudDenegadaConsultaPostulacionOfertasLaborales() throws Exception {
        mockMvc.perform(get("/api/empleado/ofertas_laborales/postulaciones/{7a424dee-7e50-4a01-ab6e-a09201677819")).andDo(print())
                .andExpect(status().isUnauthorized()); //HTTP 401
    }


}