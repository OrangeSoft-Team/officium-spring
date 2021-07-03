package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;

public class TuplaOfertaLaboral extends Tupla<NombreEmpresa, OfertaLaboral> {
    public TuplaOfertaLaboral(NombreEmpresa firstElement, OfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }
}
