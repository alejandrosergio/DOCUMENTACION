/* OPERADORES LOGICOS */

SET SERVEROUTPUT ON;


DECLARE

    A CONSTANT number := 5;
    B CONSTANT number := 10;

    nombre1 CONSTANT nvarchar2(100) := 'alejandro';
    nombre2 nvarchar2(100);


BEGIN

------------------------------------------------------------------------
    -- OPERADOR LOGICO

    IF(  A <> B) THEN

        dbms_output.put_line('A es diferente de B');

    END IF;

    /* 
        =   Igual
        <   Menor
        >   Mayor
        >=  Mayor igual
        <=  Menor igual
        <>  Diferente
    */

------------------------------------------------------------------------
    -- LIKE

    IF (nombre1 LIKE '%n%') THEN

        dbms_output.put_line('El nombre contiene la letra n ');

    END IF;

    /* 
        LIKE - LETRAS - PALABRAS
            %n   Si la letra esta al final
            n%   Si la letra esta al principio
            %n%  Si la letra esta en medio
    */

------------------------------------------------------------------------

    -- BETWEEN

    IF ( A BETWEEN 0 AND 10) THEN -- si A esta entre 5 y 10

        dbms_output.put_line('La Constante A esta entre 0 y 10');

    END IF;

------------------------------------------------------------------------

    -- IN

    IF ( B IN(5,10,15,20) ) THEN -- si A esta entre el grupo IN

        dbms_output.put_line('La Constante B esta en el grupo');

    END IF;

------------------------------------------------------------------------

    -- IS NULL

    IF ( nombre2 IS NULL ) THEN -- si A esta entre 5 y 10

        dbms_output.put_line('La variable nombre 2 es null');

    END IF;

END;
/
------------------------------------------------------------------------