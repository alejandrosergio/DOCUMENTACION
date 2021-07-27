/* CONDICIONES ANIDADAS */

SET SERVEROUTPUT ON;

DECLARE

    nota number := 3.5;

BEGIN

    IF( nota >= 4.5 ) THEN

        dbms_output.put_line('Exelente');

    ELSIF( nota >= 4.0 AND nota <= 4.4 ) THEN

        dbms_output.put_line('Muy bien');

    ELSIF( nota >= 3.5 AND nota <= 3.9 ) THEN

        dbms_output.put_line('Bien');

    ELSIF( nota >= 3.0 AND nota <= 3.4 ) THEN

        dbms_output.put_line('Debe mejorar');

    ELSE

        dbms_output.put_line('Muy mal... Debe mejorar.');

    END IF;

END;
/