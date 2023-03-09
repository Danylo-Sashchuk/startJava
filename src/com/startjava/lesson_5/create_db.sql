CREATE DATABASE Jaegers;

DROP TABLE IF EXISTS jaegers;

CREATE TABLE jaegers (
    id          serial Primary key,
    modelName   text,
    mark        integer,
    height      double precision,
    weight      integer,
    status      boolean,
    origin      text,
    launch      date,
    kaijuKill   integer
);

\i init_db.sql
\i queries.sql