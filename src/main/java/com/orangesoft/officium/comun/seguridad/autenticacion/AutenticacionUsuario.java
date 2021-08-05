package com.orangesoft.officium.comun.seguridad.autenticacion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.orangesoft.officium.comun.dominio.excepciones.NoAutorizadoExcepcion;
import com.orangesoft.officium.comun.seguridad.autenticacion.dto.JwtPayload;
import com.orangesoft.officium.comun.seguridad.autenticacion.mappers.MapeadorPersistenciaEntidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Base64;
import java.util.Optional;
import java.util.UUID;

public class AutenticacionUsuario<U, M extends MapeadorPersistenciaEntidad<U, P>, P, R extends JpaRepository<P, UUID>> {

    @Autowired
    protected R repositorio;

    @Autowired
    protected M mapeador;

    public U esUsuarioValido(String jwt){
        String[] chunks = jwt.split("\\.");
        System.out.println(chunks.toString());
        Base64.Decoder decoder = Base64.getDecoder();
        String jwtPayload = new String(decoder.decode(chunks[1]));
        System.out.println(jwtPayload);
        try{
            JwtPayload payload = new ObjectMapper().readValue(jwtPayload, JwtPayload.class);
            System.out.println(payload.getIdUsuario());
            Optional<P> persistenciaUsuario = this.repositorio.findById(UUID.fromString(payload.getIdUsuario()));
            if (persistenciaUsuario.isPresent()) {
                return this.mapeador.mapearAEntidad(persistenciaUsuario.get());
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
