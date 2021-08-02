package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida.PuertoCancelarOfertaLaboralAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.valueObjects.IdOfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.mappers.MapeadorOfertaLaboralPersistenciaAdministrador;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioCancelarOfertaLaboralAdministrador;
import com.orangesoft.officium.comun.dominio.ofertaLaboral.EnumEstatusOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.exepciones.ExcepcionOfertaLaboralNoEncontrada;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoCancelarOfertaLaboralAdministradorImp implements PuertoCancelarOfertaLaboralAdministrador {

    @Autowired
    public final RepositorioCancelarOfertaLaboralAdministrador repositorioCancelarOfertaLaboralAdministrador;

    @Override
    public void cancelarOfertaLaboral(IdOfertaLaboral idOfertaLaboral) {
        PersistenciaOfertaLaboral ofertaLaboral = this.repositorioCancelarOfertaLaboralAdministrador.getById(idOfertaLaboral.getIdOfertaLaboral());
        if (ofertaLaboral == null) {
            throw new ExcepcionOfertaLaboralNoEncontrada();
        }
        ofertaLaboral.setEstatus(EnumEstatusOfertaLaboral.CANCELADO.toString());
        this.repositorioCancelarOfertaLaboralAdministrador.save(ofertaLaboral);
    }
}
