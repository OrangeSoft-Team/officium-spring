package com.orangesoft.officium.comun.seguridad.autenticacion.mappers;

public interface MapeadorPersistenciaEntidad<U, P> {
    public U mapearAEntidad(P persistencia);
}
