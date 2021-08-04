package com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.entrada.CasoUsoCrearOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.aplicacion.salida.PuertoCrearOfertaLaboralEmpleador;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.OfertaLaboral;

public class CasoUsoCrearOfertaLaboralImpEmpleador implements CasoUsoCrearOfertaLaboralEmpleador {
    private PuertoCrearOfertaLaboralEmpleador puertoCrearOfertaLaboral;

    @Override
    public OfertaLaboral crearOfertaLaboral(OfertaLaboral ofertaLaboral) {
        puertoCrearOfertaLaboral.crearOfertaLaboral(ofertaLaboral);
        return ofertaLaboral;
    }
}
