package com.orangesoft.officium.administadorApp.administrador.infraestructura.persistencia.repositorios;

import com.orangesoft.officium.comun.persistencia.personalAdministrativo.PersistenciaPersonalAdministrativo;
import com.orangesoft.officium.comun.seguridad.autenticacion.repositorios.RepositorioObtenerPersistenciaUsuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface RepositorioObtenerAdministrador extends RepositorioObtenerPersistenciaUsuario<PersistenciaPersonalAdministrativo> {
    @Query(value = "SELECT p FROM personalesAdministrativos p WHERE p.uuid = :idAdmin")
    public PersistenciaPersonalAdministrativo obtenerPersistencia(@Param("idAdmin") UUID idAdmin);
}
