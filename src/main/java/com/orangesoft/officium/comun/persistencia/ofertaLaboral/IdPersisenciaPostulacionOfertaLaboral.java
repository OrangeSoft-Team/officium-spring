package com.orangesoft.officium.comun.persistencia.ofertaLaboral;

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
public class IdPersisenciaPostulacionOfertaLaboral implements Serializable {
    private UUID uuidEmpresa;
    private UUID uuidOferta;
    private UUID uuidEmpleado;
}
