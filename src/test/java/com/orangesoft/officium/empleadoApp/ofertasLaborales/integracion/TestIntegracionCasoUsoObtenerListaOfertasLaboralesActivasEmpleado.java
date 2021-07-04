package com.orangesoft.officium.empleadoApp.ofertasLaborales.integracion;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoObtenerListaOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoListaOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorQDTOAOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.PuertoListaOfertasLaboralesActivasImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.query.QDtoOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioOfertaLaboralActiva;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import org.mockito.junit.MockitoJUnitRunner;


import java.util.ArrayList;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestIntegracionCasoUsoObtenerListaOfertasLaboralesActivasEmpleado {

    @Mock
    private RepositorioOfertaLaboralActiva repositorioOfertaLaboralActiva;

    @Test
    public void debeDevolverListaDeOfertasLaboralesActivas() {
        OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
        ArrayList<QDtoOfertasLaboralesActivas> responseArray = new ArrayList<>();
        responseArray.add(ofertaLaboralEmpleadoMother.obtenerQDTOOfertaLaboralPython());
        when(repositorioOfertaLaboralActiva.obtenerListaOfertasLaboralesActivas()).thenReturn(responseArray);
        PuertoListaOfertasLaboralesActivas puertoListaOfertasLaboralesActivas = new PuertoListaOfertasLaboralesActivasImpl(repositorioOfertaLaboralActiva, new MapeadorQDTOAOfertaLaboralImpl());
        CasoUsoObtenerListaOfertasLaboralesActivasEmpleado casoUsoObtenerListaOfertasLaboralesActivasEmpleado = new CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImpl(puertoListaOfertasLaboralesActivas);

        System.out.println("Resultados: debeDevolverListaDeOfertasLaboralesActivas");
        Tupla<NombreEmpresa, OfertaLaboral> ofertaLaboralTuplaDeseada = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython();
        Tupla<NombreEmpresa, OfertaLaboral> ofertaLaboralTuplaObtenida = casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado().get(0);
        System.out.println(ofertaLaboralTuplaDeseada.toString());
        System.out.println(ofertaLaboralTuplaObtenida.toString());
        System.out.println("\n\n");
        assert(ofertaLaboralTuplaDeseada.equals(ofertaLaboralTuplaObtenida));

        System.out.println("Resultados: debeDevolverListaDeOfertasLaboralesActivas");
        ofertaLaboralTuplaDeseada = ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralJava();
        System.out.println(ofertaLaboralTuplaDeseada.toString());
        System.out.println(ofertaLaboralTuplaObtenida.toString());
        System.out.println("\n\n");
        assert(!ofertaLaboralTuplaDeseada.equals(ofertaLaboralTuplaObtenida));
    }
}
