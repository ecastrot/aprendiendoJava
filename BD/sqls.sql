SELECT * FROM grupo;
SELECT * FROM grupo WHERE codigo_grupo="101" AND nombre="GrupoB";
SELECT * FROM grupo WHERE codigo_grupo="101" AND nombre="GrupoC";
SELECT * FROM grupo WHERE codigo_grupo="101" OR nombre="GrupoC";
SELECT * FROM grupo WHERE descripcion LIKE '%todo';

-- Eliminar datos en la tabla
DELETE FROM `colegio`.`grupo` WHERE (`codigo_grupo` = '103');
DELETE FROM grupo WHERE codigo_grupo = '103';
DELETE FROM grupo; -- Borraria todos los datos de la tabla

-- Actualizar datos en la tabla
UPDATE `colegio`.`grupo` SET `descripcion` = 'Este es el grupo de los A' WHERE (`codigo_grupo` = '100');
UPDATE grupo SET descripcion="Este es el grupo de los A" WHERE codigo_grupo="100";
UPDATE grupo SET descripcion="Este es el grupo de los C" WHERE codigo_grupo="102";
UPDATE grupo SET descripcion="Este es el grupo de los D" WHERE codigo_grupo="104";
UPDATE grupo SET descripcion="Estos grupo no se que son" WHERE codigo_grupo!="104"; -- Diferente
UPDATE grupo SET descripcion="Estos grupo no se que son" WHERE codigo_grupo<>"104"; -- Diferente
UPDATE grupo SET descripcion="Oohhh cambia todo"; -- Peligro, siempre tratar de hacer where
UPDATE grupo SET descripcion="Estos son los grupos sin descripción" WHERE descripcion is null;
UPDATE grupo SET descripcion="Grupo con cambio multiple", nombre="GrupoMultiple" WHERE codigo_grupo="105";

-- Guardar datos en la tabla
INSERT INTO `colegio`.`grupo` (`codigo_grupo`, `nombre`, `descripcion`) VALUES ('100', 'GrupoA', 'GrupoA');
INSERT INTO grupo (codigo_grupo, nombre, descripcion) VALUES ("101","GrupoB","GrupoB");
INSERT INTO grupo VALUES ("102","GrupoC","Descripcion GrupoC");
INSERT INTO grupo (nombre,codigo_grupo,descripcion) VALUES ("GrupoD","103","Descripcion GrupoD");
INSERT INTO grupo VALUES ("103","GrupoE","GrupoE");
INSERT INTO grupo (codigo_grupo, nombre) VALUES ("104","GrupoD");
INSERT INTO `colegio`.`grupo` (`codigo_grupo`, `nombre`) VALUES ('105', 'GrupoF');
INSERT INTO estudiante VALUES(123, "Ana", "101", "Ramirez", STR_TO_DATE('4-11-1995', '%d-%m-%Y'),  2 );

SELECT * FROM colegio.estudiante;
select * from grupo;
SELECT e.numero_documento,e.nombre,e.apellidos,e.codigo_grupo from estudiante e;

select e.numero_documento, e.nombre, e.apellidos, g.nombre 
	from estudiante e inner join grupo g on (g.codigo_grupo = e.codigo_grupo);
    
select * from estudiante;    
select * from estudiante order by nombre ASC;
select * from estudiante order by nombre DESC;

select * from estudiante order by fecha_nacimiento, nivel_actual asc;
select * from estudiante order by fecha_nacimiento DESC;

select * from mentor;
select * from estudiante;

INSERT INTO `mentor` (`numero_documento`, `nombres`, `apellidos`, `anios_experiencia`, `numero_documento_estudiante`) 
VALUES ('258', 'Félix', 'González', '5', '201');

INSERT INTO `mentor` (`numero_documento`, `nombres`, `apellidos`, `anios_experiencia`, `numero_documento_estudiante`) 
VALUES ('300', 'Anyela', 'Martinez', '3', '123');

SELECT e.numero_documento, e.nombre as 'NombreEstudiante', e.apellidos, 
m.nombres as 'NombreMentor', m.apellidos 'ApellidosMentor', e.codigo_grupo
from estudiante e 
inner join mentor m on (e.numero_documento =m.numero_documento_estudiante);

SELECT e.numero_documento, e.nombre as 'NombreEstudiante', e.apellidos, m.nombres as 'NombreMentor', 
m.apellidos 'ApellidosMentor', g.nombre as "NombreGrupo" from estudiante e 
inner join mentor m on (e.numero_documento =m.numero_documento_estudiante) 
inner join grupo g on (e.codigo_grupo= g.codigo_grupo);


SELECT e.numero_documento, e.nombre, e.apellidos, m.nombres as 'Nombre_Mentor', m.apellidos 'ApellidosMentor' from estudiante e 
left join mentor m on (e.numero_documento =m.numero_documento_estudiante);

-- Lista de estudiantes sin mentores
SELECT e.numero_documento, e.nombre, e.apellidos from estudiante e 
left join mentor m on (e.numero_documento =m.numero_documento_estudiante) where m.nombres is null;

-- Lista de mentores sin estudiantes
SELECT e.numero_documento, e.nombre, e.apellidos from estudiante e 
right join mentor m on (e.numero_documento =m.numero_documento_estudiante) where m.nombres is null;

-- group by 
select * from estudiante;

select count(*) from estudiante;
select count(numero_documento) from estudiante;
select * from grupo;
INSERT INTO estudiante VALUES(855, "Juan", "Ramirez", STR_TO_DATE('4-11-1995', '%d-%m-%Y'), 1 , '101');
INSERT INTO estudiante VALUES(856, "Jesus", "Duarte", STR_TO_DATE('4-11-2000', '%d-%m-%Y'), 1 , '100', null);
INSERT INTO estudiante VALUES(857, "Cristian", "Baena", STR_TO_DATE('4-11-1998', '%d-%m-%Y'), 6 , '101', null);
select codigo_grupo, count(*) as estudiantesMenores
	from estudiante
    where Fecha_nacimiento > "1990-01-01"
group by codigo_grupo;

select codigo_grupo,nombre, max(nivel_actual)
	from estudiante
group by codigo_grupo;

-- having 
select nivel_actual, count(nivel_actual) from estudiante
group by nivel_actual;

select nivel_actual, count(nivel_actual) as 'estudiantesEnEsteNivel' from estudiante
group by nivel_actual
having count(nivel_actual) > 1;

-- herencia en base de datos
alter table grupo add intensidadHoraria int;
