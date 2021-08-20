SELECT * FROM grupo;
SELECT * FROM grupo WHERE codigo_grupo="101" AND nombre="GrupoB";
SELECT * FROM grupo WHERE codigo_grupo="101" AND nombre="GrupoC";
SELECT * FROM grupo WHERE descripcion LIKE '%cambia%';

INSERT INTO estudiante VALUES(123, "Ana", "101", "Ramirez", STR_TO_DATE('4-11-1995', '%d-%m-%Y')
,  2 );


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
INSERT INTO grupo VALUES ("102","GrupoC","GrupoC");
INSERT INTO grupo (nombre,codigo_grupo,descripcion) VALUES ("GrupoD","103","GrupoD");
INSERT INTO grupo VALUES ("103","GrupoE","GrupoE");
INSERT INTO grupo (codigo_grupo, nombre) VALUES ("104","GrupoD");
INSERT INTO `colegio`.`grupo` (`codigo_grupo`, `nombre`) VALUES ('105', 'GrupoF');

SELECT * FROM colegio.estudiante;
SELECT e.numero_documento, e.nombre, e.apellidos, e.codigo_grupo from estudiante e;

select e.numero_documento, e.nombre, e.apellidos, g.nombre 
	from estudiante e inner join grupo g on (g.codigo_grupo = e.codigo_grupo);

select * from estudiante;    
select * from estudiante order by nombre ASC;
select * from estudiante order by nombre DESC;

select * from estudiante order by fecha_nacimiento, nivel_actual asc;
select * from estudiante order by fecha_nacimiento DESC;

-- group by 
-- having 
-- herencia en base de datos
