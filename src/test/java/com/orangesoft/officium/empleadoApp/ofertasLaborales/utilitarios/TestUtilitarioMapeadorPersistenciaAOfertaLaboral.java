package com.orangesoft.officium.empleadoApp.ofertasLaborales.utilitarios;

import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;

public class TestUtilitarioMapeadorPersistenciaAOfertaLaboral {
    private final MapeadorPersistenciaAOfertaLaboral mapeadorPersistenciaAOfertaLaboral;
    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUtilitarioMapeadorPersistenciaAOfertaLaboral() {
        this.mapeadorPersistenciaAOfertaLaboral = new MapeadorPersistenciaAOfertaLaboralImpl();
        this.ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeConvertirEntidadAPersistenciaOfertaLaboral() {
        OfertaLaboral ofertaLaboral = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython().getSecondElement();
        PersistenciaOfertaLaboral persistenciaOfertaLaboralDeseada = ofertaLaboralEmpleadoMother.obtenerPersistenciaOfertaLaboralPython();
        PersistenciaOfertaLaboral persistenciaOfertaLaboralObtenida = mapeadorPersistenciaAOfertaLaboral.OfertaLaboralAPersistencia(ofertaLaboral);
        System.out.println("Resultados: debeConvertirEntidadAPersistenciaOfertaLaboral");
        System.out.println(persistenciaOfertaLaboralDeseada.toString());
        System.out.println(persistenciaOfertaLaboralObtenida.toString());
        System.out.println("\n\n");
        assert(persistenciaOfertaLaboralDeseada.equals(persistenciaOfertaLaboralObtenida));
    }

    @Test
    public void debeConvertirPersistenciaAEntidadOfertaLaboral() {
        OfertaLaboral ofertaLaboralDeseada = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython().getSecondElement();
        PersistenciaOfertaLaboral persistenciaOfertaLaboral = ofertaLaboralEmpleadoMother.obtenerPersistenciaOfertaLaboralPython();
        OfertaLaboral ofertaLaboralObtenida = mapeadorPersistenciaAOfertaLaboral.PersistenciaAOfertaLaboral(persistenciaOfertaLaboral);
        System.out.println("Resultados: debeConvertirPersistenciaAEntidadOfertaLaboral");
        System.out.println(ofertaLaboralDeseada.toString());
        System.out.println(ofertaLaboralObtenida.toString());
        System.out.println("\n\n");
        assert(ofertaLaboralDeseada.equals(ofertaLaboralObtenida));
    }
}
