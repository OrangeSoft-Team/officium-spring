package com.orangesoft.officium.comun.manejadorExcepciones.mensajesError;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class MensajeError {
    private int codigoEstatus;
    private LocalDate fecha;
    private String mensaje;
    private String descripcion;
}
