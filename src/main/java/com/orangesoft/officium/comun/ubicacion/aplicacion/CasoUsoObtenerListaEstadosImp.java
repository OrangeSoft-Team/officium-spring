package com.orangesoft.officium.comun.ubicacion.aplicacion;

import com.orangesoft.officium.comun.ubicacion.aplicacion.entrada.CasoUsoObtenerListaEstados;
import com.orangesoft.officium.comun.ubicacion.aplicacion.salida.PuertoListaEstados;
import com.orangesoft.officium.comun.ubicacion.dominio.Estado;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CasoUsoObtenerListaEstadosImp implements CasoUsoObtenerListaEstados {
    @Autowired
    public PuertoListaEstados puertoListaEstados;

    @Override
    public List<Estado> obtenerListaEstados(IdPais idPais) {
        System.out.println(puertoListaEstados.obtenerListaPaises(idPais).toString());
        return puertoListaEstados.obtenerListaPaises(idPais);
    }
}
