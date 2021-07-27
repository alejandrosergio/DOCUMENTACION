/* CONSTANTES ORACLE */

SET SERVEROUTPUT ON;
-- Permitir salidas por consola ESTANDAR -- varia su asignación


DECLARE
-- Definición de funciones y variables

    --constantes
    PI CONSTANT number := 3.141559;

    --Variables
    area number;
    radio number;

BEGIN
-- Inicio de una sentencia

    -- Declaracion de variables
    radio := 7;

    -- Hallar el area de un circulo
    area := pi * ( radio * radio);

    -- Resultado

    dbms_output.put_line('Area: ' || area || 'cm2'); -- Redondear a 2 decimales
    dbms_output.put_line('Area: ' || round( area, 2 ) || 'cm2'); -- Redondear a 2 decimales
    dbms_output.put_line('Area: ' || round( area ) || 'cm2'); -- Redondear a 2 decimales

END; -- Final de una sentencia
/ 