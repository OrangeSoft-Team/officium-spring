package com.orangesoft.officium.comun.ubicacion.aplicacion;

import com.orangesoft.officium.comun.ubicacion.dominio.Pais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdPais;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.NombrePais;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CasoUsoPedirListaPaisesImp implements CasoUsoPedirListaPaises {

    @Override
    public List<Pais> obtenerListaPaises() {
        ArrayList<Pais> arrayList = new ArrayList<>();
        arrayList.add(new Pais(new IdPais("pais"), new NombrePais("nombre")));
        return arrayList;
    }
}
