package com.orangesoft.officium.empleadorApp.Tupla;

import com.orangesoft.officium.empleadorApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;

public class TuplaEmpresaOfertaLaboral extends Tupla<Empresa,OfertaLaboral> {
    public TuplaEmpresaOfertaLaboral(Empresa firstElement, OfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }
}
