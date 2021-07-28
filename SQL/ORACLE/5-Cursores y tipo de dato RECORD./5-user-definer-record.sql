SET SERVEROUTPUT ON;

DECLARE

    TYPE vehiculo IS RECORD (   -- Definimos el tipo de dato llamado vehiculo
        marca    nvarchar2(100),
        modelo   nvarchar2(100),
        puertas  number
    );

    mazda   vehiculo;
    toyota  vehiculo;

    -- Procedimiento de impresion

    PROCEDURE imprimir_vehiculo( vh vehiculo ) 
    IS
    BEGIN
        dbms_output.put_line( vh.marca );
        dbms_output.put_line( vh.modelo );
        dbms_output.put_line( vh.puertas );
    END;

    -- Fin procedimiento de imprecion

BEGIN

    mazda.marca := 'Mazda';
    mazda.modelo := 'Mazda 3';
    mazda.puertas := 4;

    toyota.marca := 'Toyota';
    toyota.modelo := 'Prado';
    toyota.puertas := 5;


    imprimir_vehiculo( mazda );
    imprimir_vehiculo( toyota );

END;
/