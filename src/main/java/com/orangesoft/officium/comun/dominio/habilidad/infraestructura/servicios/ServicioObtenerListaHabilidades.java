package com.orangesoft.officium.comun.dominio.habilidad.infraestructura.servicios;

import com.orangesoft.officium.comun.dominio.habilidad.aplicacion.CasoDeUsoObtenerListaHabilidades;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.dto.DtoHabilidad;
import com.orangesoft.officium.comun.dominio.habilidad.infraestructura.mapeadores.MapeadorHabilidadDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioObtenerListaHabilidades {
    @Autowired
    private final MapeadorHabilidadDTO mapeadorHabilidadDTO;
    @Autowired
    private final CasoDeUsoObtenerListaHabilidades casoDeUsoObtenerListaHabilidades;

    @Transactional(readOnly = true)
    public List<DtoHabilidad> ObtenerListaHabilidades() {
        return casoDeUsoObtenerListaHabilidades.ObtenerListaHabilidades()
                .stream()
                .map(mapeadorHabilidadDTO::HabilidadADtoHabilidad)
                .collect(Collectors.toList());
    }
}
