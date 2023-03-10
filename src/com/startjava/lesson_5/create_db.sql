CREATE DATABASE jaegers;

\c jaegers;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id          SERIAL PRIMARY KEY,
    modelName   TEXT,
    mark        INTEGER,
    height      DOUBLE PRECISION,
    weight      INTEGER,
    status      BOOLEAN,
    origin      TEXT,
    launch      DATE,
    kaijuKill   INTEGER
);

\ir init_db.sql
\ir queries.sql