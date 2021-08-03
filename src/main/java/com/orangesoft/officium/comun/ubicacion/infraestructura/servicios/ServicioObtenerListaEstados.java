package com.orangesoft.officium.comun.ubicacion.infraestructura.servicios;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoObtenerListaEstados;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoEstado;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorDTOEstado;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioObtenerListaEstados {

    @Autowired
    private final CasoUsoObtenerListaEstados casoUsoObtenerListaEstados;
    @Autowired
    private final MapeadorDTOEstado mapeadorDTOEstado;

    @Transactional(readOnly = true)
    public List<DtoEstado> obtenerListaEstados(String idPais) {
        return casoUsoObtenerListaEstados.obtenerListaEstados(new IdPais(UUID.fromString(idPais)))
                .stream()
                .map(mapeadorDTOEstado::mapEstadoADto)
                .collect(Collectors.toList());
    }
}