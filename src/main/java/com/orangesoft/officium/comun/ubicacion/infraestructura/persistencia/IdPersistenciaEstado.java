package com.orangesoft.officium.comun.ubicacion.infraestructura.persistencia;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.annotation.Reference;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ForeignKey;
import javax.persistence.ManyToOne;
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
