package com.orangesoft.officium.empleadorApp.empresa.infraestructura.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoDatosBasicosEmpresa {
    private String nombreEmpresa;
    private String correoElectronico;
    private String requisitosEspeciales;
    private String calleUno;
    private String calleDos;
    private String codigoPostal;
    private String uuidPais;
    private String uuidEstado;
    private String uuidCiudad;
    private String uuidHabilidad;
    private String nombreHabilidad;
    private String categoriaHabilidad;
}
