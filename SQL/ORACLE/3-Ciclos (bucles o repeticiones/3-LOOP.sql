/* CICLO LOOP */

SET SERVEROUTPUT ON;

DECLARE

    x number := 10; -- Declaramos su iterador

BEGIN

    << ciclo_loop >>
    LOOP

        dbms_output.put_line( x ); -- Imprimimos el valor del iterador
        x := x + 10; -- Incrementemos de 10 en 10 el iterador


        IF ( x > 120 ) THEN -- Si el iterador es mayor a 120 se rompe el ciclo LOOP
            EXIT;
        END IF;

    END LOOP ciclo_loop;


END;
/