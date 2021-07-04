package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;


public class TuplaEmpresaOfertaLaboral extends Tupla<Empresa, OfertaLaboral> {
    public TuplaEmpresaOfertaLaboral(Empresa firstElement, OfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }
}
