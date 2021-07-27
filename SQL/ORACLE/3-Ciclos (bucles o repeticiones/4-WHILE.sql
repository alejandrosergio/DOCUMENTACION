/* CICLO WHILE */

SET SERVEROUTPUT ON;

DECLARE

    x number := 10; -- Declaramos su iterador

BEGIN

    << ciclo_while >>
    WHILE x <= 100 LOOP -- Repita hasta que la variable x sea menor o igual a 100

        dbms_output.put_line( x ); -- Imprimimos el valor del iterador
        x := x + 10; -- Incrementemos de 10 en 10 el iterador

    END LOOP ciclo_while;


END;
/