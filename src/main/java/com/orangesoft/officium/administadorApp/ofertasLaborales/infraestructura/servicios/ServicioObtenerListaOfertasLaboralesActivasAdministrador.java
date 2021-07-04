package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.entrada.CasoDeUsoObtenerListaOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDtoOfertaLaboralesActivasAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServicioObtenerListaOfertasLaboralesActivasAdministrador {
    @Autowired
    private final MapeadorDtoOfertaLaboralesActivasAdministrador mapeadorDtoOfertaLaboralesActivasAdministrador;
    @Autowired
    private final CasoDeUsoObtenerListaOfertasLaboralesActivasAdministrador casoDeUsoObtenerListaOfertasLaboralesActivasAdministrador;

    public List<DtoOfertasLaboralesActivasAdministrador> obtenerListaOfertasLaboralesActivasAdministrador() {
        ArrayList<DtoOfertasLaboralesActivasAdministrador> listaOfertasLaboralesActivasEmpleado = new ArrayList<>();
        casoDeUsoObtenerListaOfertasLaboralesActivasAdministrador.obtenerListaOfertasLaboralesActivas()
                .forEach((P)->listaOfertasLaboralesActivasEmpleado.add(mapeadorDtoOfertaLaboralesActivasAdministrador.mapOfertaLaboralADto(P)));
        return listaOfertasLaboralesActivasEmpleado;
    }
}
