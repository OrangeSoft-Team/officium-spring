CREATE TABLE IF NOT EXISTS paises
(
    uuid   uuid primary key,
    nombre VARCHAR(250) not null unique
);

CREATE TABLE IF NOT EXISTS estados
(
    uuid_pais uuid,
    uuid      uuid,
    nombre    VARCHAR(250) not null unique,
    CONSTRAINT estados_pk_uuid PRIMARY KEY (uuid_pais, uuid),
    CONSTRAINT estados_fk_uuid_pais FOREIGN KEY (uuid_pais) REFERENCES paises
);

CREATE TABLE IF NOT EXISTS ciudades
(
    uuid_pais   uuid,
    uuid_estado uuid,
    uuid        uuid,
    nombre      VARCHAR(250) not null unique,
    CONSTRAINT ciudades_pk_uuid PRIMARY KEY (uuid_pais, uuid_estado, uuid),
    CONSTRAINT ciudades_fk_uuid_estado FOREIGN KEY (uuid_pais, uuid_estado) REFERENCES estados
);

CREATE TABLE IF NOT EXISTS personal_administrativo
(
    uuid               uuid primary key,
    correo_electronico VARCHAR(250) not null unique,
    contrasena         VARCHAR(100) not null,
    primer_nombre      VARCHAR(80)  not null,
    primer_apellido    VARCHAR(80)  not null,
    genero             CHAR(1)      not null,
    numero_telefonico  VARCHAR(25)  not null,
    fecha_nacimiento   DATE         not null,
    activo             BOOLEAN      not null,
    segundo_nombre     VARCHAR(80),
    segundo_apellido   VARCHAR(80),
    CONSTRAINT personal_administrativo_ctr_genero check (genero IN ('M', 'F'))
);

CREATE TABLE IF NOT EXISTS empleados
(
    uuid               uuid primary key,
    correo_electronico VARCHAR(250) not null unique,
    contrasena         VARCHAR(100) not null,
    primer_nombre      VARCHAR(80)  not null,
    primer_apellido    VARCHAR(80)  not null,
    genero             CHAR(1)      not null,
    numero_telefonico  VARCHAR(25)  not null,
    fecha_nacimiento   DATE         not null,
    activo             BOOLEAN      not null,
    uuid_pais          uuid         NOT NULL,
    uuid_estado        uuid         NOT NULL,
    uuid_ciudad        uuid         NOT NULL,
    segundo_nombre     VARCHAR(80),
    segundo_apellido   VARCHAR(80),
    CONSTRAINT empresas_fk_ciudad FOREIGN KEY (uuid_pais, uuid_estado, uuid_ciudad) REFERENCES ciudades,
    CONSTRAINT empleados_ctr_genero CHECK (genero IN ('M', 'F'))
);
CREATE TABLE IF NOT EXISTS empresas
(
    uuid               uuid primary key,
    nombre             VARCHAR(250) not null,
    correo_electronico VARCHAR(250) not null,
    direccion_calle    VARCHAR(250) not null,
    codigo_postal      VARCHAR(100) not null,
    uuid_pais          uuid         NOT NULL,
    uuid_estado        uuid         NOT NULL,
    uuid_ciudad        uuid         NOT NULL,
    CONSTRAINT empresas_fk_ciudad FOREIGN KEY (uuid_pais, uuid_estado, uuid_ciudad) REFERENCES ciudades
);

CREATE TABLE IF NOT EXISTS delegados
(
    uuid_empresa       uuid,
    uuid               uuid,
    correo_electronico VARCHAR(250) not null unique,
    contrasena         VARCHAR(100) not null,
    primer_nombre      VARCHAR(80)  not null,
    primer_apellido    VARCHAR(80)  not null,
    genero             CHAR(1)      not null,
    numero_telefonico  VARCHAR(25)  not null,
    fecha_nacimiento   DATE         not null,
    cargo              VARCHAR(150) not null,
    activo             BOOLEAN      not null,
    segundo_nombre     VARCHAR(80),
    segundo_apellido   VARCHAR(80),
    CONSTRAINT delegados_pk_uuid PRIMARY KEY (uuid_empresa, uuid),
    CONSTRAINT delegados_pk_uuid_empresa FOREIGN KEY (uuid_empresa) REFERENCES empresas
);

CREATE TABLE IF NOT EXISTS ofertas_laborales
(
    uuid_empresa              uuid,
    uuid                      uuid,
    titulo                    VARCHAR(150)   not null,
    fecha_publicacion         DATE           not null,
    fecha_ultima_modificacion DATE           not null,
    cargo                     VARCHAR(150)   not null,
    sueldo                    numeric(30, 2) not null,
    divisa                    VARCHAR(30)    not null,
    descripcion               VARCHAR(250)   not null,
    duracion_estimada_escala  VARCHAR(50)    not null,
    duracion_estimada         VARCHAR(100)   not null,
    turno_trabajo             VARCHAR(20)    not null,
    numero_vacantes           numeric(5, 0)  not null,
    estado                    CHAR(1)        not null,
    CONSTRAINT ofertas_laborales_pk_uuid PRIMARY KEY (uuid_empresa, uuid),
    CONSTRAINT ofertas_laborales_fk_uuid_empresa FOREIGN KEY (uuid_empresa) REFERENCES empresas,
    CONSTRAINT ofertas_laborales_chk_estado CHECK (estado IN ('P', 'C'))
);

CREATE TABLE IF NOT EXISTS postulacion_oferta_laboral
(
    uuid_empresa         uuid,
    uuid_oferta          uuid,
    uuid_empleado        uuid,
    fecha_de_postulacion date         not null,
    comenatario          VARCHAR(250) not null,
    estado               CHAR(1)      not null,
    CONSTRAINT postulacion_oferta_laboral_pk_uuid PRIMARY KEY (uuid_empresa, uuid_empleado, uuid_oferta),
    CONSTRAINT postulacion_oferta_laboral_fk_uuid_oferta FOREIGN KEY (uuid_empresa, uuid_oferta) REFERENCES ofertas_laborales,
    CONSTRAINT postulacion_oferta_laboral_fk_uuid_empleado FOREIGN KEY (uuid_empleado) REFERENCES empleados,
    CONSTRAINT postulacion_oferta_laboral_chk_estado CHECK (estado IN ('A', 'R', 'P'))
);

