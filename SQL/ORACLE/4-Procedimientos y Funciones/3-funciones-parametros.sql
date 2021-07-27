/* FUNCIONES CON PARAMETROS */

CREATE OR REPLACE FUNCTION mayor_entre ( x IN NUMBER, y IN NUMBER ) -- Recibimos dos parametros x es un numero

RETURN NUMBER

IS

BEGIN

    IF ( x > y ) THEN

        RETURN x;
    ELSE
        RETURN y;

    END IF;


END;
/


--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

/* EJECUTAR LA FUNCION */

SET SERVEOUTPUT ON;

DECLARE

    a number := 42;
    b number := 23;

    z number;

BEGIN

    z := mayor_entre( a , b );
    dbms_output.put_line('El numero mayor es: ' || z );

END;
/

-- OTRA FORMA DE LLAMAR LA FUNCION

SELECT mayor_entre( 23 , 45 ) FROM dual;