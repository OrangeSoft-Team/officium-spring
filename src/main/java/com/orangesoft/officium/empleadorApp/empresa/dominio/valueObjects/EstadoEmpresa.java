package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionEstadoEmpresaNoNull;

public class EstadoEmpresa {
    private final EnumEstadoEstadoEmpresa estadoEmpresa;

    public EstadoEmpresa(EnumEstadoEstadoEmpresa estadoEmpresa){
        this.validarEstadoEmpresa(estadoEmpresa);
        this.estadoEmpresa=estadoEmpresa;

    }
    private void validarEstadoEmpresa(EnumEstadoEstadoEmpresa estadoEmpresa){
         {
            if(estadoEmpresa == null)
                throw new ExcepcionEstadoEmpresaNoNull();
        }
    }
}
