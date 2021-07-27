SET SERVEROUTPUT ON;


DECLARE

    salario_base number := 1500;
    aumento number;
    porcentaje number;
    total number;

BEGIN 

    dbms_output.put_line('Salario base: ' || salario_base );

    ------------------------------------------------------------------

    IF( salario_base <= 600 ) THEN

        aumento := salario_base * 0.15;
        porcentaje := 15;
    
    ELSIF( salario_base BETWEEN 601 AND 950 ) THEN

        aumento := salario_base * 0.135;
        porcentaje := 13.5;

    ELSIF( salario_base BETWEEN 951 AND 1400 ) THEN

        aumento := salario_base * 0.10;
        porcentaje := 10;

    ELSIF( salario_base >= 1401) THEN

        aumento := salario_base * 0.05;
        porcentaje := 5;

    END IF;

    ------------------------------------------------------------------

    IF ( aumento > 0 ) THEN
        dbms_output.put_line('Aumento es: ' || aumento  || '$');
        dbms_output.put_line('Porcentaje fue: ' || porcentaje || '%' );
        total := salario_base + aumento;
        dbms_output.put_line('Total salario es: ' || total  || '$');
    ELSE
        dbms_output.put_line('No se aumento el sueldo');
    END IF;

    ------------------------------------------------------------------

END;
/