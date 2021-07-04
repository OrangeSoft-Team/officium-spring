package com.orangesoft.officium.administadorApp.ofertasLaborales.aplicacion.salida;

import com.orangesoft.officium.administadorApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.dto.DtoCrearOfertaLaboralEmpresaAdministrador;

public interface PuertoCrearOfertaLaboralAdministrador {
    public void crearOfertaLaboral(OfertaLaboral ofertaLaboral);
}
