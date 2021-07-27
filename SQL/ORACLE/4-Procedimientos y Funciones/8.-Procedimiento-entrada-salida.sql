CREATE OR REPLACE PROCEDURE menor_entre( x IN NUMBER, y IN NUMBER, z OUT NUMBER)  -- IN: ENTRADA -- OUT: SALIDA

IS

BEGIN
    
    IF( X > Y ) THEN
        z := y; -- salida
    ELSE
        z := x; --salida
    END IF;

END;
/

----------------------------------------------------------
----------------------------------------------------------

SET SERVEROUTPUT ON;

DECLARE
    a number := 5;
    b number := 10;

    z number;

BEGIN

    menor_entre( a, b , z);

    dbms_output.put_line('El menor es: ' || z );

END;
/