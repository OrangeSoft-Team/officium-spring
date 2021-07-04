package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoVerOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.dto.DtoOfertasLaboralesActivasEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.mappers.MapeadorDTOOfertasLaboralesActivasEmpleador;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class ServicioVerOfertasLaboralesActivasEmpleador {
    @Autowired
    private final MapeadorDTOOfertasLaboralesActivasEmpleador mapeadorDTOOfertasLaboralesActivas;

    @Autowired
    private final CasoUsoVerOfertasLaboralesActivasEmpleador casoUsoVerOfertasLaboralesActivas;

    @Transactional(readOnly = true)
    public List<DtoOfertasLaboralesActivasEmpleador> ofertasLaboralesActivas(String idEmpresa){
        try{
            UUID.fromString(idEmpresa);
        }catch (RuntimeException e) {
            throw new RuntimeException("Formato de indentificador invalido");
        }
        return casoUsoVerOfertasLaboralesActivas.ofertasLaboralesActivas(new IdEmpresa(idEmpresa))
                .stream()
                .map(mapeadorDTOOfertasLaboralesActivas::mapOfertaLaboraActivaADto)
                .collect(Collectors.toList());
    }

}
