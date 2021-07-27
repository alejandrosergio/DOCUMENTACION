/* ASIGNAR QUERYS A VARIABLES ORACLE */

SET SERVEROUTPUT ON;
-- Permitir salidas por consola ESTANDAR -- varia su asignación


    SELECT * FROM dual; -- seleccione los registros de la tabla dual

    SELECT COUNT(*) FROM dual; -- seleccione y cuente los registros de la tabla dual

    SELECT USER FROM dual; -- seleccione y mustre el usuario de la tabla dual


DECLARE
-- Definición de funciones y variables

    cantidad number;
    usuario nvarchar2(100);    

BEGIN
-- Inicio de una sentencia


    SELECT USER INTO usuario FROM dual; -- seleccione y guarde el usuario en la variable usuario
    SELECT COUNT(*) INTO cantidad FROM dual; -- seleccione y guarde el conteo en la variable cantidad

    dbms_output.put_line('Usuario: ' || usuario);
    dbms_output.put_line('Cantidad: ' || cantidad); 
    

    -- Simplificado

    SELECT USER,COUNT(*) INTO usuario,cantidad FROM dual; -- Dos consultas separadas por coma y asignadas en su orden

    dbms_output.put_line('Usuario: ' || usuario);
    dbms_output.put_line('Cantidad: ' || cantidad); 

END; -- Final de una sentencia
/