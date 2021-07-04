package com.orangesoft.officium.administadorApp.ofertasLaborales.infraestructura.persistencia.entidades;

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
public class IdPersistenciaOfertaLaboral implements Serializable{
    private UUID uuidEmpresa;
    private UUID uuid;
}
