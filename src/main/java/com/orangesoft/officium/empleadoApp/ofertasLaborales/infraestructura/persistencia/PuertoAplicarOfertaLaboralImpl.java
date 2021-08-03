package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoAplicarOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaPostulacionOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioAplicarOfertaLaboral;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PuertoAplicarOfertaLaboralImpl implements PuertoAplicarOfertaLaboral {
    @Autowired
    private final MapeadorPersistenciaPostulacionOfertaLaboral mapeadorPersistenciaAPostulacionOfertaLaboral;

    @Autowired
    private final RepositorioAplicarOfertaLaboral repositorioAplicarOfertaLaboral;

    @Override
    public void aplicarOfertaLaboral(PostulacionOfertaLaboral postulacionOfertaLaboral) {
        repositorioAplicarOfertaLaboral.save(mapeadorPersistenciaAPostulacionOfertaLaboral.PostulacionOfertaLaboralAPersistencia(postulacionOfertaLaboral));
    }
}
