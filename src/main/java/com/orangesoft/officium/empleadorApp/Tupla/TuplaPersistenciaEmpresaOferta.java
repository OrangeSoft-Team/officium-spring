package com.orangesoft.officium.empleadorApp.Tupla;


import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;

public class TuplaPersistenciaEmpresaOferta extends Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral>{
    public TuplaPersistenciaEmpresaOferta(PersistenciaEmpresa firstElement, PersistenciaOfertaLaboral secondElement) {
        super(firstElement, secondElement);
    }
}
