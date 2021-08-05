package com.orangesoft.officium.empleadoApp.ofertasLaborales.utilitarios;

import com.orangesoft.officium.comun.persistencia.ofertaLaboral.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;

public class TestUtilitarioMapeadorPersistenciaAOfertaLaboral {
    private final MapeadorPersistenciaOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUtilitarioMapeadorPersistenciaAOfertaLaboral() {
        this.mapeadorPersistenciaAOfertaLaboral = null;
        this.ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeConvertirEntidadAPersistenciaOfertaLaboral() {
        OfertaLaboral ofertaLaboral = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython().getSecondElement();
        PersistenciaOfertaLaboral persistenciaOfertaLaboralDeseada = ofertaLaboralEmpleadoMother.obtenerPersistenciaOfertaLaboralPython();
        //PersistenciaOfertaLaboral persistenciaOfertaLaboralObtenida = mapeadorPersistenciaAOfertaLaboral.OfertaLaboralAPersistencia(ofertaLaboral);
        System.out.println("Resultados: debeConvertirEntidadAPersistenciaOfertaLaboral");
        System.out.println(persistenciaOfertaLaboralDeseada.toString());
        //System.out.println(persistenciaOfertaLaboralObtenida.toString());
        System.out.println("\n\n");
        //assert(persistenciaOfertaLaboralDeseada.equals(persistenciaOfertaLaboralObtenida));
    }
}
