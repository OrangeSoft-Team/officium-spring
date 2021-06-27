package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class IdPersistenciaEstado implements Serializable {
    private UUID uuidPais;
    private UUID uuid;
}
