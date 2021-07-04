package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoObtenerListaOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorOfertaLaboralDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioObtenerListaOfertasLaboralesActivasEmpleado {
    @Autowired
    private final MapeadorOfertaLaboralDTO mapeadorOfertaLaboralDTO;
    @Autowired
    private final CasoUsoObtenerListaOfertasLaboralesActivasEmpleado casoUsoObtenerListaOfertasLaboralesActivasEmpleado;

    @Transactional(readOnly = true)
    public List<DtoOfertasLaboralesActivasEmpleado> obtenerListaOfertasLaboralesActivasEmpleado() {
        ArrayList<DtoOfertasLaboralesActivasEmpleado> listaOfertasLaboralesActivasEmpleado = new ArrayList<>();
        casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado()
                .forEach((P)->listaOfertasLaboralesActivasEmpleado.add(mapeadorOfertaLaboralDTO.mapOfertaLaboralADto(P.getFirstElement(),P.getSecondElement())));
        return listaOfertasLaboralesActivasEmpleado;
    }
}
