package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoVerOfertasLaboralesActivas;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDTOOfertasLaboralesActivas;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class ServicioVerOfertasLaboralesActivas {
    @Autowired
    private final MapeadorDTOOfertasLaboralesActivas mapeadorDTOOfertasLaboralesActivas;

    @Autowired
    private final CasoUsoVerOfertasLaboralesActivas casoUsoVerOfertasLaboralesActivas;

    @Transactional(readOnly = true)
    public List<DtoOfertasLaboralesActivasEmpresa> ofertasLaboralesActivas(){
        return casoUsoVerOfertasLaboralesActivas.ofertasLaboralesActivas()
                .stream()
                .map(mapeadorDTOOfertasLaboralesActivas::mapOfertaLaboraActivaADto)
                .collect(Collectors.toList());
    }

}
