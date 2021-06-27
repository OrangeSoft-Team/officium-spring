package com.orangesoft.officium.comun.ubicacion.infraestructura.servicios;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoObtenerListaCiudades;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdEstado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.infraestructura.dto.DtoCiudad;
import com.orangesoft.officium.comun.ubicacion.infraestructura.mappers.MapeadorDTOCiudad;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ServicioObtenerListaCiudades {
    @Autowired
    private final CasoUsoObtenerListaCiudades casoUsoObtenerListaCiudades;
    @Autowired
    private final MapeadorDTOCiudad mapeadorDTOCiudad;

    @Transactional(readOnly = true)
    public List<DtoCiudad> obtenerListaCiudades(String idPais, String idEstado) {
        return casoUsoObtenerListaCiudades.obtenerListaCiudades(new IdPais(idPais), new IdEstado(idEstado))
                .stream()
                .map(mapeadorDTOCiudad::mapCiudadADto)
                .collect(Collectors.toList());
    }
}
