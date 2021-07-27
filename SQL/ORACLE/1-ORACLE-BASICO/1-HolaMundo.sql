/* HOLA MUNDO EN ORACLE */

SET SERVEROUTPUT ON;
-- Permitir salidas por consola ESTANDAR -- varia su asignación


DECLARE
-- Definición de funciones y variables


BEGIN
-- Inicio de una sentencia

dbms_output.put_line('Hello Word of Oracle');
-- Imprimir por consola
dbms_output.put_line('Alejandro');
dbms_output.put_line('Software Developer');

END; -- Final de una sentencia
/