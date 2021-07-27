/* FUNCON BASICA OBTENER EL TOTAL DE REGISTROS EN LA TABLA*/

CREATE OR REPLACE FUNCTION total_empleados -- Creamos la funcion con su nombre

RETURN NUMBER -- Declaramos el tipo de retorno de la funcion

IS -- Declarammos las variables con las que cuenta la funcion

    total number := 0; -- variable de la funcion

BEGIN -- Se ejecuta la logica de la funcion

    SELECT COUNT(*) INTO total FROM EMPLEADOS; -- Logica de la funcion

    RETURN total; -- Retorno de la funcion


END; -- Termina la logica de la funcion
/

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

/* EJECUTAR LA FUNCION */

SET SERVEOUTPUT ON;

DECLARE

empleados number := total_empleados();

BEGIN

    dbms_output.put_line('Total de empleados: ' || empleados );

END;
/

-- OTRA FORMA DE LLAMAR LA FUNCION

SELECT total_empleados FROM dual;