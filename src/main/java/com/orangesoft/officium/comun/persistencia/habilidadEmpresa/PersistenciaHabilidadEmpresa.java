package com.orangesoft.officium.comun.persistencia.habilidadEmpresa;

import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "habilidadesEmpresas")
public class PersistenciaHabilidadEmpresa {
    @EmbeddedId
    private PersistenciaIdHabilidadEmpresa id;
}
