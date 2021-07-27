/* CICLO FOR */

SET SERVEROUTPUT ON;

DECLARE


BEGIN

    << ciclo_tabla_2 >>
    FOR i IN 1..10 LOOP

        dbms_output.put_line('2x' || i || '=' || (2*i) );

    END LOOP ciclo_tabla_2;


END;
/