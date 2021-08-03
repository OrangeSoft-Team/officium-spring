package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoObtenerDetallesOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.NombreDireccionOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorQDtoDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.query.QDtoDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioObtenerHabilidadOfertaLaboral;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.Habilidad;
import com.orangesoft.officium.comun.dominio.habilidad.dominio.value.IdHabilidad;
import com.orangesoft.officium.comun.persistencia.direccion.PersistenciaDireccion;
import com.orangesoft.officium.comun.ubicacion.dominio.Direccion;
import com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia.repositorios.RepositorioDireccion;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class PuertoObtenerDetallesOfertaLaboralAdministradorImp implements PuertoObtenerDetallesOfertaLaboralAdministrador {

    @Autowired
    private final RepositorioDetalleOfertaLaboralAdministrador repositorioDetalleOfertaLaboral;

    @Autowired
    private final RepositorioDireccion repositorioDireccion;

    @Autowired
    private final RepositorioObtenerHabilidadOfertaLaboral repositorioObtenerHabilidadOfertaLaboral;

    @Autowired
    private final MapeadorQDtoDetalleOfertaLaboralAdministrador mapeadorQDtoDetalleOfertaLaboral;

    @Autowired
    private final MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador mapeadorAPersistenciaHabilidadOfertaLaboralAdministrador;

    @Override
    public OfertaLaboral obtenerDetalles(IdOfertaLaboral idOfertaLaboral) {
        QDtoDetalleOfertaLaboralAdministrador detalleOfertaLaboralAdministrador = repositorioDetalleOfertaLaboral.obtenerDetallesOfertaLaboral(idOfertaLaboral.getIdOfertaLaboral());
        if (detalleOfertaLaboralAdministrador == null) {
            return null;
        }
        OfertaLaboral ofertaLaboral = mapeadorQDtoDetalleOfertaLaboral.PersistenciaAOfertaLaboral(detalleOfertaLaboralAdministrador);
        PersistenciaDireccion direccion = repositorioDireccion.getById(detalleOfertaLaboralAdministrador.getDireccion());
        ofertaLaboral.setDireccionOfertaLaboral(new NombreDireccionOfertaLaboral(direccion.getCalleUno(), direccion.getCalleDos()));
        List<Habilidad> habilidadList = new ArrayList<>();
        repositorioObtenerHabilidadOfertaLaboral.obtenerHabilidadesPorIdOfertaLaboral(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral())
            .forEach(persistenciaHabilidad -> {
                habilidadList.add(mapeadorAPersistenciaHabilidadOfertaLaboralAdministrador.persistenciaAHabilidad(persistenciaHabilidad));
            });
        ofertaLaboral.setHabilidades(habilidadList);
        return ofertaLaboral;
    }
}
