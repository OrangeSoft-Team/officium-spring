package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.PostulacionOfertaLaboral;

public class TripletaEmpresaOfertaPostulacion extends Tripleta<Empresa, OfertaLaboral, PostulacionOfertaLaboral> {
    public TripletaEmpresaOfertaPostulacion(Empresa firstElement, OfertaLaboral secondElement, PostulacionOfertaLaboral thirdElement) {
        super(firstElement, secondElement, thirdElement);
    }
}
