package com.orangesoft.officium.comun.manejadorExcepciones;

import com.orangesoft.officium.comun.dominio.excepciones.MalaSolicitudExcepcion;
import com.orangesoft.officium.comun.manejadorExcepciones.mensajesError.MensajeError;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@Component
@AllArgsConstructor
public class MalaSolicitudManejadorExcepcion {
    @ExceptionHandler(value = {MalaSolicitudExcepcion.class})
    public ResponseEntity<MensajeError> resourceNotFoundException(MalaSolicitudExcepcion ex, WebRequest request) {
        MensajeError message = new MensajeError(
                HttpStatus.BAD_REQUEST.value(),
                LocalDate.now(),
                ex.getMessage(),
                "");
        return new ResponseEntity<MensajeError>(message, HttpStatus.BAD_REQUEST);
    }
}
