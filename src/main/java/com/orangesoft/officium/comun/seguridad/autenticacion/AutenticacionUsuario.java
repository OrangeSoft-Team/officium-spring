package com.orangesoft.officium.comun.seguridad.autenticacion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.orangesoft.officium.comun.dominio.excepciones.NoAutorizadoExcepcion;
import com.orangesoft.officium.comun.seguridad.autenticacion.dto.JwtPayload;
import com.orangesoft.officium.comun.seguridad.autenticacion.mappers.MapeadorPersistenciaEntidad;
import com.orangesoft.officium.comun.seguridad.autenticacion.repositorios.RepositorioObtenerPersistenciaUsuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Base64;
import java.util.UUID;

public class AutenticacionUsuario<U, M extends MapeadorPersistenciaEntidad<U, P>, P, R extends RepositorioObtenerPersistenciaUsuario<P>>{

    @Autowired
    protected R repositorio;

    @Autowired
    protected M mapeador;

    public U esUsuarioValido(String jwt){
        String[] chunks = jwt.split("\\.");
        Base64.Decoder decoder = Base64.getDecoder();
        String jwtPayload = new String(decoder.decode(chunks[1]));
        try{
            JwtPayload payload = new ObjectMapper().readValue(jwtPayload, JwtPayload.class);
            P persistenciaUsuario = this.repositorio.obtenerPersistencia(UUID.fromString(payload.getIdUsuario()));
            if (persistenciaUsuario != null) {
                return this.mapeador.mapearAEntidad(persistenciaUsuario);
            }
            throw new NoAutorizadoExcepcion("Usuario no autorizado");
        }catch (NoAutorizadoExcepcion e) {
            throw new NoAutorizadoExcepcion("Usuario no autorizado");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
