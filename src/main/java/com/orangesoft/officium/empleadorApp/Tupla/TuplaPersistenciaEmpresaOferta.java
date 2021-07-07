package com.orangesoft.officium.empleadorApp.Tupla;

import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;

public class TuplaPersistenciaEmpresaOferta extends Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral>{
    public TuplaPersistenciaEmpresaOferta(PersistenciaEmpresa firstElement, PersistenciaOfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }
}
