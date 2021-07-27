/* CONDICION SEGUN EL CASO */

SET SERVEROUTPUT ON;

DECLARE

    ran number := round( dbms_random.value(0,5) );

BEGIN

    dbms_output.put_line('Numero random: ' || ran );


    CASE
        WHEN ran = 0 THEN
            dbms_output.put_line('CERO');
        WHEN ran = 1 THEN
            dbms_output.put_line('UNO');
        WHEN ran = 2 THEN
            dbms_output.put_line('DOS');
        WHEN ran = 3 THEN
            dbms_output.put_line('TRES');
        WHEN ran = 4 THEN
            dbms_output.put_line('CUATRO');
        ELSE
            dbms_output.put_line('CINCO');
    END CASE;


END;
/