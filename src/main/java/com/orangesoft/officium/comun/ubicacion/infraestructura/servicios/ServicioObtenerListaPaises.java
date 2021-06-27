package com.orangesoft.officium.comun.ubicacion.infraestructura.servicios;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoObtenerListaPaises;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorDTOCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorDTOPais;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioObtenerListaPaises {

    @Autowired
    private final MapeadorDTOPais mapeadorDTOPais;
    @Autowired
    private final CasoUsoObtenerListaPaises casoUsoObtenerListaPaises;

    @Transactional(readOnly = true)
    public List<DtoPais> obtenerListaPaises() {
        return casoUsoObtenerListaPaises.obtenerListaPaises()
                .stream()
                .map(mapeadorDTOPais::mapPaisADto)
                .collect(Collectors.toList());
    }
}
