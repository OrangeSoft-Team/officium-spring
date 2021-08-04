package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;


import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.repositorio.RepositorioEmpresaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoCrearOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioCrearHabilidadOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioCrearOfertaLaboralEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PuertoCrerOfertaLaboralImpEmpleador implements PuertoCrearOfertaLaboralEmpleador {

    @Autowired
    private final RepositorioCrearOfertaLaboralEmpleador repositorioCrearOfertaLaboralEmpleador;
    @Autowired
    private final RepositorioEmpresaEmpleador repositorioEmpresaEmpleador;
    @Autowired
    private final RepositorioCrearHabilidadOfertaLaboralEmpleador repositorioCrearHabilidadOfertaLaboralEmpleador;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboral mapeadorPersistenciaOfertaLaboral;

    @Override
    public void crearOfertaLaboral(OfertaLaboral ofertaLaboral){


    }
}
