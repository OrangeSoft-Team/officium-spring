package com.orangesoft.officium.empleadorApp.ofertasLaborales.infraestructura.persistencia.entidades;

import com.orangesoft.officium.empleadorApp.ofertasLaborales.dominio.valueObjects.DuracionEstimadaEscala;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name="ofertaLaboral")
public class PersistenciaOfertaLaboral {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull
    private String titulo;
    @NotNull
    private String fechaPublicacion;
    @NotNull
    private String fechaUltimamodificacion;
    @NotNull
    private String cargo;
    @NotNull
    private float sueldo;
    @NotNull
    private String descripcion;
    @NotNull
    private Integer duracionEstimadaEscala;
    @NotNull
    private String duracionEstimadaValor;
    @NotNull
    private String turnoTrabajo;
    @NotNull
    private String numeroVacantes;
    @NotNull
    private String estado;

}
