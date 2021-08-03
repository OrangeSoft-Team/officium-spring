package com.orangesoft.officium.comun.persistencia.habilidadEmpresa;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
public class PersistenciaIdHabilidadEmpresa implements Serializable {
    private UUID uuidHabilidad;
    private UUID uuidEmpresa;
}
