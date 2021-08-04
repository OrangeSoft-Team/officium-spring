package com.orangesoft.officium.comun.manejadorExcepciones;

import com.orangesoft.officium.comun.dominio.excepciones.NoAutorizadoExcepcion;
import com.orangesoft.officium.comun.manejadorExcepciones.mensajesError.MensajeError;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDate;

@AllArgsConstructor
@ControllerAdvice
public class NoAutorizadoManejadorExcepcion {
    @ExceptionHandler(value = {NoAutorizadoExcepcion.class})
    public ResponseEntity<MensajeError> resourceNotFoundException(NoAutorizadoExcepcion ex, WebRequest request) {
        MensajeError message = new MensajeError(
                HttpStatus.UNAUTHORIZED.value(),
                LocalDate.now(),
                ex.getMessage(),
                "");
        return new ResponseEntity<MensajeError>(message, HttpStatus.UNAUTHORIZED);
    }
}
