package com.orangesoft.officium.empleadoApp.ofertasLaborales.integracion;

import com.orangesoft.officium.comun.generics.Tupla;
import com.orangesoft.officium.empleadoApp.empresa.dominio.Empresa;
import com.orangesoft.officium.empleadoApp.empresa.dominio.value.NombreEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.mapper.MapeadorPersistenciaEmpresaImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.CasoUsoConsultarDetallesOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.aplicacion.entrada.CasoUsoConsultarDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.OfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.dominio.value.IdOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.mapeadores.MapeadorPersistenciaAOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.PuertoDetallesOfertaLaboralImpl;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.entidades.PersistenciaOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.infraestructura.persistencia.repositorios.RepositorioDetallesOfertaLaboral;
import com.orangesoft.officium.empleadoApp.ofertasLaborales.mothers.OfertaLaboralEmpleadoMother;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestIntegracionCasoUsoConsultarDetallesOfertaLaboral {

    @Mock
    private RepositorioDetallesOfertaLaboral repositorioDetallesOfertaLaboral;

    @Test
    public void debeDevolverDetallesOfertaLaboral(){
        OfertaLaboralEmpleadoMother ofertaLaboralEmpleadoMother = new OfertaLaboralEmpleadoMother();
        Tupla<PersistenciaEmpresa, PersistenciaOfertaLaboral> ofertaLaboralTupla = ofertaLaboralEmpleadoMother.obtenerPersistenciaEmpresaOfertaLaboralPython();
        when(repositorioDetallesOfertaLaboral.obtenerDetallesOfertaLaboral(ofertaLaboralEmpleadoMother.getOfertaUUID())).thenReturn(ofertaLaboralTupla);

        CasoUsoConsultarDetallesOfertaLaboral casoUsoConsultarDetallesOfertaLaboral =
                new CasoUsoConsultarDetallesOfertaLaboralImpl(
                        new PuertoDetallesOfertaLaboralImpl(
                                new MapeadorPersistenciaAOfertaLaboralImpl(),
                                new MapeadorPersistenciaEmpresaImpl(),
                                repositorioDetallesOfertaLaboral));

        Tupla<Empresa, OfertaLaboral> empresaOfertaLaboralTuplaEsperada = ofertaLaboralEmpleadoMother.obtenerEmpresaOfertaLaboralPython();
        Tupla<Empresa, OfertaLaboral> empresaOfertaLaboralTuplaObtenida = casoUsoConsultarDetallesOfertaLaboral.consultarDetallesOfertaLaboral(new IdOfertaLaboral(ofertaLaboralEmpleadoMother.getOfertaUUID().toString()));

        System.out.println("Resultados: debeDevolverDetallesOfertaLaboral");
        System.out.println(empresaOfertaLaboralTuplaEsperada.toString());
        System.out.println(empresaOfertaLaboralTuplaObtenida.toString());
        System.out.println("\n\n");
        assert(empresaOfertaLaboralTuplaEsperada.equals(empresaOfertaLaboralTuplaObtenida));
    }
}
