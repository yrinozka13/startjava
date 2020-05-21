CREATE DATABASE jaegers;
\c jaegers;
CREATE TABLE robots (
    id        SERIAL PRIMARY KEY, 
    modelName TEXT,
    mark      TEXT, 
    height    CHAR(6), 
    weight    double precision, 
    status    TEXT, 
    origin    TEXT, 
    launch    DATE, 
    kaijuKill INTEGER
);

