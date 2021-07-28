SET SERVEROUTPUT ON;

DECLARE

    empleado         nvarchar2(200);
    salario          number;
    dias_trabajados  number(2);
    salario_diario   number;
    salario_pagar    number;


    CURSOR c_empleado IS 
    SELECT NOMBRE,SALARIO,DIAS_TRABAJDOS FROM EMPLEADOS ORDER BY NOMBRE ASC;

    PROCEDURE imprimir_empleado( empleado IN nvarchar2, salario_diario IN number, dias_trabajados IN number, salario_pagar IN number ) 
    IS
    BEGIN
        dbms_output.put_line('==========================================');
        dbms_output.put_line('Empleado: '        || empleado);
        dbms_output.put_line('Salario diario: '  || salario_diario);
        dbms_output.put_line('Días trabajados: ' || dias_trabajados);
        dbms_output.put_line('Salario a pagar: ' || salario_pagar);
        dbms_output.put_line('==========================================');
    END;

BEGIN

    OPEN c_empleado;

        LOOP

            FETCH c_empleado INTO empleado, salario, dias_trabajados;

                salario_diario := TRUNC(salario / 30, 3);

                salario_pagar := TRUNC(salario_diario * dias_trabajados, 3);

                imprimir_empleado( empleado, salario_diario, dias_trabajados, salario_pagar );

            EXIT WHEN c_empleado%NOTFOUND;

        END LOOP;

    CLOSE c_empleado;

END;
/