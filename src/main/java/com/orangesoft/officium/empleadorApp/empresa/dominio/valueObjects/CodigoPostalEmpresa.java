package com.orangesoft.officium.empleadorApp.empresa.dominio.valueObjects;

import com.orangesoft.officium.empleadorApp.empresa.dominio.excepciones.ExcepcionCodigoPostalNulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@EqualsAndHashCode
@Getter
public class CodigoPostalEmpresa {
 private final String codigoPostalEmpresa;
        public CodigoPostalEmpresa(String codigoPostalEmpresa){
            if(codigoPostalEmpresa==null || codigoPostalEmpresa.isEmpty())
                throw new ExcepcionCodigoPostalNulo();
            this.codigoPostalEmpresa=codigoPostalEmpresa;
        }
    }

