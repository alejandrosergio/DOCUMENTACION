/* CICLO EXIT AND CONTINUE */

SET SERVEROUTPUT ON;

DECLARE


BEGIN

---------------------------EXIT------------------------------------

    << ciclo_tabla_2 >> -- Marcadores
    FOR i IN 1..10 LOOP

        dbms_output.put_line('2x' || i || '=' || (2*i) );

    IF( i = 5 ) THEN  
        EXIT;       -- EXIT -- termine todo el bucle
    END IF;

    END LOOP ciclo_tabla_2;

----------------------------CONTINUE--------------------------------

    << ciclo_tabla_2 >> -- Marcadores
    FOR i IN 1..10 LOOP


    IF( MOD(i,2) <> 0 ) THEN   -- MOD: sacar el modulo 
        CONTINUE;       -- CONTINUE con el siclo -- no ejecute lo de abajo -- vuelva a empezar
    END IF;

    dbms_output.put_line('2x' || i || '=' || (2*i) );


    END LOOP ciclo_tabla_2;


END;
/