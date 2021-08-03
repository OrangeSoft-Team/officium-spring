package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorPersistenciaHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.persistencia.repositorios.RepositorioHabilidades;
import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.comun.generics.TuplaEmpresaOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioDireccion;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.mapper.MapeadorPersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetallesOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;


@Component
@AllArgsConstructor
public class PuertoDetallesOfertaLaboralImpl implements PuertoDetallesOfertaLaboral {
    @Autowired
    private final MapeadorPersistenciaOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    @Autowired
    private final MapeadorPersistenciaEmpresa mapeadorPersistenciaEmpresa;
    @Autowired
    private final MapeadorPersistenciaHabilidad mapeadorPersistenciaHabilidad;
    @Autowired
    private final RepositorioDetallesOfertaLaboral repositorioDetallesOfertaLaboral;
    @Autowired
    private final RepositorioHabilidades repositorioHabilidades;
    @Autowired
    private final RepositorioDireccion repositorioDireccion;

    @Override
    public Tupla<Empresa, OfertaLaboral> obtenerDetallesOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboralTupla = repositorioDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(idOfertaLaboral.getIdOfertaLaboral());
        TuplaEmpresaOfertaLaboral respuesta = ofertaLaboralTupla == null? null: new TuplaEmpresaOfertaLaboral(
               mapeadorPersistenciaEmpresa.PersistenciaAEmpresa(ofertaLaboralTupla.getFirstElement(), repositorioDireccion.buscarDireccionIdEmpresa(ofertaLaboralTupla.getFirstElement().getUuid())),
               mapeadorPersistenciaAOfertaLaboral.PersistenciaAOfertaLaboral(ofertaLaboralTupla.getSecondElement()));
        if(respuesta != null)
            respuesta.getSecondElement().setHabilidades(
                    repositorioHabilidades.obtenerHabilidadesOfertaLaboral(ofertaLaboralTupla.getFirstElement().getUuid())
                            .stream()
                            .map(mapeadorPersistenciaHabilidad::PersistenciaAHabilidad)
                            .collect(Collectors.toList())
            );
        return respuesta;
    }
}
