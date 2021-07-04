package com.orangesoft.officium.empleadoApp.ofertasLaborales.unitarios;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoObtenerListaOfertasLaboralesActivasEmpleado;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.salida.PuertoListaOfertasLaboralesActivas;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class TestUnitarioCasoUsoObtenerListaOfertasLaboralesActivasEmpleado {

    private final OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother;

    public TestUnitarioCasoUsoObtenerListaOfertasLaboralesActivasEmpleado() {
        this.ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
    }

    @Test
    public void debeRetornarListaOfertasLaboralesEmpleado(){
        PuertoListaOfertasLaboralesActivas puertoListaOfertasLaboralesActivas = Mockito.mock(PuertoListaOfertasLaboralesActivas.class);
        when(puertoListaOfertasLaboralesActivas.obtenerListaOfertasLaboralesActivas()).thenReturn(listaDeOfertas());
        CasoUsoObtenerListaOfertasLaboralesActivasEmpleado casoUsoObtenerListaOfertasLaboralesActivasEmpleado = new CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImpl(puertoListaOfertasLaboralesActivas);
        System.out.println("Resultados: debeRetornarListaOfertasLaboralesEmpleado");
        System.out.println(listaDeOfertas().toString());
        System.out.println(casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado().toString());
        System.out.println("\n\n");
        assert(listaDeOfertas().equals(casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado()));
    }

    @Test
    public void debeRetornarVacioListaOfertasLaboralesEmpleado(){
        PuertoListaOfertasLaboralesActivas puertoListaOfertasLaboralesActivas = Mockito.mock(PuertoListaOfertasLaboralesActivas.class);
        when(puertoListaOfertasLaboralesActivas.obtenerListaOfertasLaboralesActivas()).thenReturn(new ArrayList<Tupla<NombreEmpresa, OfertaLaboral>>());
        CasoUsoObtenerListaOfertasLaboralesActivasEmpleado casoUsoObtenerListaOfertasLaboralesActivasEmpleado = new CasoUsoObtenerListaOfertasLaboralesActivasEmpleadoImpl(puertoListaOfertasLaboralesActivas);
        System.out.println("Resultados: debeRetornarVacioListaOfertasLaboralesEmpleado");
        System.out.println((new ArrayList<Tupla<NombreEmpresa, OfertaLaboral>>()).toString());
        System.out.println(casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado().toString());
        System.out.println("\n\n");
        assert(!listaDeOfertas().equals(casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado()));
        assert((new ArrayList<Tupla<NombreEmpresa, OfertaLaboral>>()).equals(casoUsoObtenerListaOfertasLaboralesActivasEmpleado.consultarListaOfertasLaboralesActivasEmpleado()));

    }

    private List<Tupla<NombreEmpresa, OfertaLaboral>> listaDeOfertas() {
        ArrayList<Tupla<NombreEmpresa,OfertaLaboral>> arrayList = new ArrayList<>();
        arrayList.add(ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralJava());
        arrayList.add(ofertaLaboralEmpleadoMother.obtenerEntidadOfertaLaboralPython());
        return arrayList;
    }
}
