package com.orangesoft.officium.comun.ubicacion.infraestructura.servicios;

import com.orangesoft.officium.comun.ubicacion.aplicacion.CasoUsoPedirListaPaises;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorPais;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioObtenerListaPaises {

    @Autowired
    private final MapeadorPais mapeadorPais;
    @Autowired
    private final CasoUsoPedirListaPaises casoUsoPedirListaPaises;

    public List<DtoPais> obtenerListaPaises() {
        return casoUsoPedirListaPaises.obtenerListaPaises()
                .stream()
                .map(mapeadorPais::mapPaisADto)
                .collect(Collectors.toList());
    }
}
