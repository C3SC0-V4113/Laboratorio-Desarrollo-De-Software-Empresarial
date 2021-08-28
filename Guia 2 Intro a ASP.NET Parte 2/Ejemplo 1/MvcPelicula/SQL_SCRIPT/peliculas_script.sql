use master;
drop database pelicula;
create database pelicula;
use pelicula;
create table peliculas (
 ID INT PRIMARY KEY IDENTITY (1, 1),
 titulo VARCHAR(60),
 fechaLanzamiento DATETIME,
 genero VARCHAR(60),
 precio DECIMAL
 );

 INSERT INTO peliculas(titulo,fechaLanzamiento,genero,precio)
 VALUES ('Piratas del Caribe: En El Fin Del Mundo',25/05/2007,'Aventura',6.99);

 SELECT*FROM peliculas