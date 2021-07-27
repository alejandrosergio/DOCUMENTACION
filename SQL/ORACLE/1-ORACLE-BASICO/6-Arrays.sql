/* ARRAY'S ORACLE */

SET SERVEROUTPUT ON;
-- Permitir salidas por consola ESTANDAR -- varia su asignación


DECLARE
-- Definición de funciones y variables

    --Definimos los arreglos

    type alumnosArray is varray(5) of nvarchar2(100);
    -- La variable alumnosArray es un array de 5 posiciones de tipo texto de 100 caracteres

    type notasArray is varray(5) of number;
    -- La variable notasArray es un array de 5 posiciones de tipo numeros


    --Utilizamos los arreglos
    alumnos alumnosArray; -- Se pueden llenar en la declaracion
    notas notasArray;


BEGIN
-- Inicio de una sentencia

    alumnos := alumnosArray('Alejandro','Alison','Danna','Jose','koral'); -- Las posiciones cuentan desde 1
    notas := notasArray(5.0, 3.5, 4.3, 4.0, 3.8);

    -- NOMBRES
    dbms_output.put_line( alumnos(1) );
    dbms_output.put_line( alumnos(2) );
    dbms_output.put_line( alumnos(3) );
    dbms_output.put_line( alumnos(4) );
    dbms_output.put_line( alumnos(5) );

    --NOTAS
    dbms_output.put_line( notas(1) );
    dbms_output.put_line( notas(2) );
    dbms_output.put_line( notas(3) );
    dbms_output.put_line( notas(4) );
    dbms_output.put_line( notas(5) );

    --ASIGNAR NUEVO VALOR
    notas(4) := 3.3;

    dbms_output.put_line( notas(4) );

END;-- Final de una sentencia
/