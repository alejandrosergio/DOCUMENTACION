/* TAREA 2 */

SET SERVEROUTPUT ON;

DECLARE

    numero number := 5;
    factorial number := 1;

    x number := 1;

BEGIN

    << ciclo_factorial >>
    WHILE x <= numero LOOP -- Repita hasta que la variable x sea menor o igual a 100

        factorial := factorial * x;

        x := x + 1;

    END LOOP ciclo_factorial;

    dbms_output.put_line('El factorial de ' || numero || ' es: ' || factorial );

END;
/