/* CONDICIONES IF THEN ELSE OR AND BETWEEN */

SET SERVEROUTPUT ON;


DECLARE

    nota number := 3.9;


BEGIN

    IF( nota = 4.0 OR nota = 3.9 OR 3.8 ) THEN -- Inicializamos la condicion si nota es igual a 4.0 o a 3.9 o a 3.8 

        nota := 4.5;

    END IF; -- Terminamos la condicion

    --- SIMPLIFICADO

        IF( nota BETWEEN 3.8 AND 4.2 ) THEN -- Inicializamos la condicion si nota esta entre 3.8 a 4.2

        nota := 4.5;

    END IF; -- Terminamos la condicion



    -- IF ELSE

    IF ( nota >= 4.5 ) THEN


    dbms_output.put_line('El estudiante aprovo la materia con un: ' || nota );

    ELSE

    dbms_output.put_line('El estudiante reprovo la materia con un: ' || nota );

    END IF;

END;
/