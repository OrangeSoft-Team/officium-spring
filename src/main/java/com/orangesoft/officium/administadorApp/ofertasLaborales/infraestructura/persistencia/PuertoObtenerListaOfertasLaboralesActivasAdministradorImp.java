package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorQDTOAOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioOfertaLaboralActiva;
import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerListaOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;

@Component
@AllArgsConstructor
public class PuertoObtenerListaOfertasLaboralesActivasAdministradorImp implements PuertoObtenerListaOfertasLaboralesActivasAdministrador {

    @Autowired
    private final RepositorioOfertaLaboralActiva repositorioOfertaLaboralActiva;

    @Autowired
    private final MapeadorQDTOAOfertaLaboral mapeadorQDTOAOfertaLaboral;

    @Override
    public List<OfertaLaboral> obtenerListOfertasLaborales() {
        List<OfertaLaboral> resultado = new ArrayList<>();
        repositorioOfertaLaboralActiva.obtenerListaOfertasLaboralesActivas().forEach((e)->{
            resultado.add(mapeadorQDTOAOfertaLaboral.PersistenciaAOfertaLaboral(e));
        });
        return resultado;
    }
}
