/* PROCEDIMIENTO BASICO */

CREATE OR REPLACE PROCEDURE hola_mundo -- Inicializamos un procedimiento sin parametros

AS -- Declaracion de las variables

BEGIN -- Logica del procedimiento

    dbms_output.put_line('Hola mundo');

END; -- Final logica del procedimiento
/

--------------------------------------------------------------------------
--------------------------------------------------------------------------

/* PROCEDIMIENTO */

CREATE OR REPLACE PROCEDURE actualiza_fecha_empleados -- Inicializamos un procedimiento sin parametros

AS -- Declaracion de las variables

BEGIN -- Logica del procedimiento

    UPDATE EMPLEADOS SET ACTUALIZADO = SYSDATE;

    dbms_output.put_line('DATOS ACTUALIZADOS');

    SELECT NOMBRE,ACTUALIZADO FROM EMPLEADOS;

END; -- Final logica del procedimiento
/

--------------------------------------------------------------------------
--------------------------------------------------------------------------

-- Ejecutar el procedimiento.. -- SOLO

EXECUTE hola_mundo;

EXECUTE actualiza_fecha_empleados;