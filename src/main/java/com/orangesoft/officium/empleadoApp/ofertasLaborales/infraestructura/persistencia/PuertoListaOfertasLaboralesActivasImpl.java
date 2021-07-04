package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoListaOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorQDTOAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioOfertaLaboralActiva;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
@AllArgsConstructor
public class PuertoListaOfertasLaboralesActivasImpl implements PuertoListaOfertasLaboralesActivas {
    @Autowired
    private final RepositorioOfertaLaboralActiva repositorioOfertaLaboralActiva;
    @Autowired
    private final MapeadorQDTOAOfertaLaboral mapeadorQDTOAOfertaLaboral;

    @Override
    public List<Tupla<NombreEmpresa, OfertaLaboral>> obtenerListaOfertasLaboralesActivas() {
        List<Tupla<NombreEmpresa, OfertaLaboral>> resultado = new ArrayList<>();
        repositorioOfertaLaboralActiva.obtenerListaOfertasLaboralesActivas().forEach((e)->{
            resultado.add(new TuplaOfertaLaboral(new NombreEmpresa(e.getNombreEmpresa()), mapeadorQDTOAOfertaLaboral.PersistenciaAOfertaLaboral(e)));
        });
        return resultado;
    }
}
