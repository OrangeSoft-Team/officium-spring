package com.orangesoft.officium.empleadorApp.Tupla;

import com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;

public class TuplaPersistenciaEmpresaOferta extends Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral>{
    public TuplaPersistenciaEmpresaOferta(PersistenciaEmpresa firstElement, PersistenciaOfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }
}
