package com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.servicios;

import com.orangesoft.officium.comun.generics.TripletaEmpresaOfertaPostulacion;
import com.orangesoft.officium.empleadoApp.empleado.dominio.values.IdEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.dto.DtoConsultarPostulacionesOfertasLaboralesEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPostulacionOfertaLaboralDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ServicioConsultarPostulacionesOfertasLaboralesEmpleado {
    @Autowired
    private final CasoUsoConsultarPostulacionesOfertasLaboralesEmpleado casoUsoConsultarPostulacionesOfertasLaboralesEmpleado;
    @Autowired
    private final MapeadorPostulacionOfertaLaboralDTO mapeadorPostulacionOfertaLaboralDTO;

    @Transactional(readOnly = true)
    public List<DtoConsultarPostulacionesOfertasLaboralesEmpleado> consultarPostulacionesOfertasLaboralesEmpleado(String idEmpleado) {
        try{
            UUID.fromString(idEmpleado);
        }catch (IllegalArgumentException e){
            throw new RuntimeException("El identificador suministrado no cumple con el formato esperado");
        }
        List<TripletaEmpresaOfertaPostulacion> tripletaEmpresaOfertaPostulacions =  casoUsoConsultarPostulacionesOfertasLaboralesEmpleado.obtenerPostulacionesOfertaLaboral(new IdEmpleado(idEmpleado));
        List<DtoConsultarPostulacionesOfertasLaboralesEmpleado> dtoConsultarPostulacionesOfertasLaboralesEmpleadoArrayList = new ArrayList<>();
        tripletaEmpresaOfertaPostulacions.forEach((e)->{
            dtoConsultarPostulacionesOfertasLaboralesEmpleadoArrayList.add(mapeadorPostulacionOfertaLaboralDTO.mapPostulacionOfertasLaboralesADto(e.getFirstElement(),e.getSecondElement(),e.getThirdElement()));
        });
        return dtoConsultarPostulacionesOfertasLaboralesEmpleadoArrayList;
    }
}
