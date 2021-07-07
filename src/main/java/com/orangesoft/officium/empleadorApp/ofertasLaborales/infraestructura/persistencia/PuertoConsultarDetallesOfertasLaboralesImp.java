package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.Tupla.Tupla;
import com.orangesoft.officium.empleadorApp.Tupla.TuplaEmpresaOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoConsultarDetallesOfertasLaborales;
import com.orangesoft.officium.empleadorApp.empresa.infraestructura.mappers.MapeadorPersistenciaEmpresa;
import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorPersistenciaOfertaLaboralActiva;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.repositorio.RepositorioConsultarDetallesOfertasLaborales;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PuertoConsultarDetallesOfertasLaboralesImp implements com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoConsultarDetallesOfertasLaborales {

    @Autowired
    private final RepositorioConsultarDetallesOfertasLaborales repositorioConsultarDetallesOfertasLaborales;
    @Autowired
    private final MapeadorPersistenciaEmpresa mapeadorPersistenciaEmpresa;
    @Autowired
    private final MapeadorPersistenciaOfertaLaboralActiva mapeadorPersistenciaOfertaLaboralActiva;

    @Override
    public Tupla<Empresa, OfertaLaboral> consultarDetallesOfertasLaborales(IdOfertaLaboral idOfertaLaboral) {
        Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboralTupla = repositorioConsultarDetallesOfertasLaborales.consultarDetallesOfertaLaboral(UUID.fromString(idOfertaLaboral.getIdOfertaLaboral()));
        return ofertaLaboralTupla == null? null: new TuplaEmpresaOfertaLaboral (
                mapeadorPersistenciaEmpresa.PersistenciaAEmpresa(ofertaLaboralTupla.getFirstElement()),
                mapeadorPersistenciaOfertaLaboralActiva.persistenciaAOfertaLaboral(ofertaLaboralTupla.getSecondElement()));
    }


}