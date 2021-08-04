package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;


import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import com.orangesoft.officium.empleadorApp.Tupla.TuplaEmpresaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.empresa.infraestructura.mappers.MapeadorPersistenciaEmpresaEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoConsultarDetallesOfertasLaboralesEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorPersistenciaOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioConsultarDetallesOfertasLaboralesEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoConsultarDetallesOfertasLaboralesImpEmpleador implements PuertoConsultarDetallesOfertasLaboralesEmpleador {
    @Autowired
    private final RepositorioConsultarDetallesOfertasLaboralesEmpleador repositorioConsultarDetallesOfertasLaborales;
    @Autowired
    private final MapeadorPersistenciaEmpresaEmpleador mapeadorPersistenciaEmpresa;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboralEmpleador mapeadorPersistenciaOfertaLaboralActiva;

    @Override
    public Tupla<Empresa, OfertaLaboral> consultarDetallesOfertasLaborales(IdOfertaLaboral idOfertaLaboral) {
        Tupla <PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboralTupla = repositorioConsultarDetallesOfertasLaborales.consultarDetallesOfertaLaboral(UUID.fromString(idOfertaLaboral.getIdOfertaLaboral()));
        return ofertaLaboralTupla == null? null: new TuplaEmpresaOfertaLaboral(
                mapeadorPersistenciaEmpresa.PersistenciaAEmpresa(ofertaLaboralTupla.getFirstElement()),
                mapeadorPersistenciaOfertaLaboralActiva.persistenciaOfertaLaboral(ofertaLaboralTupla.getSecondElement()));
    }


}
