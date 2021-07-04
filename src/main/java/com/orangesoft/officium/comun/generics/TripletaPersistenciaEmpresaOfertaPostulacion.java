package com.orangesoft.officium.comun.generics;

import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaPostulacionOfertaLaboral;

public class TripletaPersistenciaEmpresaOfertaPostulacion extends Tripleta<PersistenciaEmpresa, PersistenciaOfertaLaboral, PersistenciaPostulacionOfertaLaboral> {
    public TripletaPersistenciaEmpresaOfertaPostulacion(PersistenciaEmpresa firstElement, PersistenciaOfertaLaboral secondElement, PersistenciaPostulacionOfertaLaboral thirdElement) {
        super(firstElement, secondElement, thirdElement);
    }
}
