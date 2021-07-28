SET SERVEROUTPUT ON;

DECLARE

    promedio number(5,2);

BEGIN

    << ciclo_filas_notas >>
    FOR fila IN ( SELECT * FROM NOTAS ORDER BY NOMBRE ASC ) LOOP -- recoremos toda una tabla cambiando su valor cada que itere por la fila

        promedio := (fila.NOTA1 + fila.NOTA2 + fila.NOTA3 + fila.NOTA4) / 4;

        dbms_output.put_line('Nombre: ' || fila.NOMBRE || ' - Promedio: ' || promedio);

    END LOOP ciclo_filas_notas;


END;
/