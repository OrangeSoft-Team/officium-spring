package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaEmpresaOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.mapper.MapeadorPersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetallesOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@AllArgsConstructor
public class PuertoDetallesOfertaLaboralImpl implements PuertoDetallesOfertaLaboral {
    @Autowired
    private final MapeadorPersistenciaAOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaEmpresa mapeadorPersistenciaEmpresa;
    @Autowired
    private final RepositorioDetallesOfertaLaboral repositorioDetallesOfertaLaboral;

    @Override
    public Tupla<Empresa, OfertaLaboral> obtenerDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboralTupla = repositorioDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(UUID.fromString(idOfertaLaboral.getIdOfertaLaboral()));
        return ofertaLaboralTupla == null? null: new TuplaEmpresaOfertaLaboral(
               mapeadorPersistenciaEmpresa.PersistenciaAEmpresa(ofertaLaboralTupla.getFirstElement()),
               mapeadorPersistenciaAOfertaLaboral.PersistenciaAOfertaLaboral(ofertaLaboralTupla.getSecondElement()));
    }
}
