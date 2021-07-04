package com.orangesoft.officium.empleadorApp.empresa.infraestructura.persistencia.repositorio;

import com.orangesoft.officium.empleadoApp.empresa.infraestructura.persistencia.entidades.PersistenciaEmpresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositorioEmpresaEmpleador extends JpaRepository<PersistenciaEmpresa, UUID> {
}
