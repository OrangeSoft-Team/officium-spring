package com.orangesoft.officium.empleadorApp.Tupla;

import com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;

public class TuplaOfertaLaboral extends Tupla<NombreEmpresa, OfertaLaboral> {
    public TuplaOfertaLaboral(NombreEmpresa firstElement, OfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }

}
