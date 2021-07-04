package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.comun.persistencia.empresa.PersistenciaEmpresa;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaPostulacionOfertaLaboral;

public class TripletaPersistenciaEmpresaOfertaPostulacion extends Tripleta<PersistenciaEmpresa, PersistenciaOfertaLaboral, PersistenciaPostulacionOfertaLaboral> {
    public TripletaPersistenciaEmpresaOfertaPostulacion(PersistenciaEmpresa firstElement, PersistenciaOfertaLaboral secondElement, PersistenciaPostulacionOfertaLaboral thirdElement) {
        super(firstElement, secondElement, thirdElement);
    }
}
