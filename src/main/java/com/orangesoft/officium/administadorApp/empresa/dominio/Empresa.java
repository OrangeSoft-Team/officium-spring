package com.orangesoft.officium.administadorApp.empresa.dominio;

import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.CorreoElectronicoEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.IdEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NombreEmpresa;
import com.orangesoft.officium.administadorApp.empresa.dominio.valueObjects.NumeroTelefonicoEmpresa;
import com.orangesoft.officium.comun.ubicacion.dominio.valueObjects.IdCiudad;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Builder
@Getter
@Setter
public class Empresa {
    private IdEmpresa identificador;
    private NombreEmpresa nombre;
    private IdCiudad direccion;
    private NumeroTelefonicoEmpresa numeroTelefonico;
    private CorreoElectronicoEmpresa correoElectronico;
}
