package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorQDTOAOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioOfertaLaboralActivaAdministrador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerListaOfertasLaboralesActivasAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;

@Component
@AllArgsConstructor
public class PuertoObtenerListaOfertasLaboralesActivasAdministradorImp implements PuertoObtenerListaOfertasLaboralesActivasAdministrador {

    @Autowired
    private final RepositorioOfertaLaboralActivaAdministrador repositorioOfertaLaboralActiva;

    @Autowired
    private final MapeadorQDTOAOfertaLaboralAdministrador mapeadorQDTOAOfertaLaboral;

    @Override
    public List<OfertaLaboral> obtenerListOfertasLaborales() {
        List<OfertaLaboral> resultado = new ArrayList<>();
        repositorioOfertaLaboralActiva.obtenerListaOfertasLaboralesActivas().forEach((e)->{
            resultado.add(mapeadorQDTOAOfertaLaboral.PersistenciaAOfertaLaboral(e));
        });
        return resultado;
    }
}
