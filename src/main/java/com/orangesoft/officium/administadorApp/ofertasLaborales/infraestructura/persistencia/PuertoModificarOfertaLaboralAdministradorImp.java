package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoModificarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorOfertaLaboralPersistenciaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioCrearHabilidadOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetalleOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioObtenerHabilidadOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.habilidad.PersistenciaHabilidad;
import com.orangesoft.officium.comun.persistencia.habilidadesOfertaLaboral.PersistenciaIdHabilidadOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PuertoModificarOfertaLaboralAdministradorImp implements PuertoModificarOfertaLaboralAdministrador {

    @Autowired
    private final RepositorioDetalleOfertaLaboralAdministrador repositorioDetalleOfertaLaboralAdministrador;

    @Autowired
    private final RepositorioObtenerHabilidadOfertaLaboral repositorioObtenerHabilidadOfertaLaboral;

    @Autowired
    private final RepositorioCrearHabilidadOfertaLaboral repositorioCrearHabilidadOfertaLaboral;

    @Autowired
    private final MapeadorAPersistenciaHabilidadOfertaLaboralAdministrador mapeadorAPersistenciaHabilidadOfertaLaboralAdministrador;

    @Autowired
    private final MapeadorOfertaLaboralPersistenciaAdministrador mapeadorOfertaLaboralPersistenciaAdministrador;

    @Override
    public void modifcarOfertaLaboral(IdOfertaLaboral idOfertaLaboral, OfertaLaboral ofertaLaboral) {
        PersistenciaOfertaLaboral persistenciaOfertaLaboral = mapeadorOfertaLaboralPersistenciaAdministrador.ofertaLaboralAPersistencia(ofertaLaboral);
        repositorioDetalleOfertaLaboralAdministrador.save(persistenciaOfertaLaboral);
        List<PersistenciaHabilidad> habilidadOfertaLaboralList = repositorioObtenerHabilidadOfertaLaboral.obtenerHabilidadesPorIdOfertaLaboral(ofertaLaboral.getIdOfertaLaboral().getIdOfertaLaboral());
        // Se eliminan los registros de HabilidadOfertaLaboral de la oferta laboral existentes en la base de datos
        habilidadOfertaLaboralList.forEach(persistenciaHabilidad -> {
            repositorioCrearHabilidadOfertaLaboral.delete(
                    repositorioObtenerHabilidadOfertaLaboral.getById(
                            new PersistenciaIdHabilidadOfertaLaboral(persistenciaHabilidad.getUuid(), persistenciaOfertaLaboral.getUuid())
                    )
            );
        });
        // Se agregan nuevos registros de HabilidadOfertaLaboral
        ofertaLaboral.getHabilidades().forEach(habilidad -> {
            repositorioCrearHabilidadOfertaLaboral.save(
                    mapeadorAPersistenciaHabilidadOfertaLaboralAdministrador.habilidadAPersistencia(ofertaLaboral.getIdOfertaLaboral() ,habilidad.getIdHabilidad())
            );
        });
    }
}
