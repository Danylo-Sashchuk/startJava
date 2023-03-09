CREATE DATABASE jaegers;


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

\ir init_db.sql
\ir queries.sql