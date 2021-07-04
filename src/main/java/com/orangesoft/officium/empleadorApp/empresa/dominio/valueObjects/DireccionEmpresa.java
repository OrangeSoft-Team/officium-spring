package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;


import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionDireccionEmpresaNula;
import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionLongitudDireccionEmpresaInvalida;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
    public class DireccionEmpresa {
        private final String direccionEmpresa;

        public DireccionEmpresa(String direccionEmpresa) {
            validarDireccionEmpresa(direccionEmpresa);
            this.direccionEmpresa = direccionEmpresa;
        }

        private void validarDireccionEmpresa(String direccionEmpresa) {
            if(direccionEmpresa == null)
                throw new ExcepcionDireccionEmpresaNula();
            if(direccionEmpresa.length() < 4 || direccionEmpresa.length() > 256)
                throw new ExcepcionLongitudDireccionEmpresaInvalida();
        }
    }


