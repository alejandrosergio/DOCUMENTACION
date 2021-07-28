SET SERVEROUTPUT ON;

DECLARE

    nombre nvarchar2(200);
    salario number;

    CURSOR c_empleado IS 
    SELECT NOMBRE,SALARIO FROM EMPLEADOS ORDER BY SALARIO ASC;  -- Creamos un cursor explicito

BEGIN

    OPEN c_empleado; -- Abrimos el cursor explicito

        LOOP -- EJECUTAMOS UN CICLO LOOP - los ciclos loop salen con exit;

            FETCH c_empleado INTO nombre,salario; -- Recuperamos cada uno de los campos y los almacenamos en las variables

            EXIT WHEN c_empleado%NOTFOUND; -- Salimos del loop cuando no encuntre mas registros

            dbms_output.put_line( nombre || ' - ' || salario );

        END LOOP;

    CLOSE c_empleado; -- Cerramos el cursor explicito


END;
/