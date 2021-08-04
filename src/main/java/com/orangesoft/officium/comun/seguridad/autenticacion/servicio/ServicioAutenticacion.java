package com.orangesoft.officium.comun.seguridad.autenticacion.servicio;

import com.orangesoft.officium.comun.dominio.excepciones.NoAutorizadoExcepcion;
import com.orangesoft.officium.comun.seguridad.autenticacion.AutenticacionUsuario;
import com.orangesoft.officium.comun.seguridad.autenticacion.mappers.MapeadorPersistenciaEntidad;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class ServicioAutenticacion<U, M extends MapeadorPersistenciaEntidad<U, P>, P, R extends JpaRepository<P, UUID>> {

    @Autowired
    private final AutenticacionUsuario<U, M, P, R> autenticacion;

    public U validarUsuario(String token){
        if (token == null) {
            throw new NoAutorizadoExcepcion("Debe haber un token de autorizacion");
        }
        token = token.replace("Bearer ", "");
        return (U)this.autenticacion.esUsuarioValido(token);
    }
}
