SET SERVEROUTPUT ON;

DECLARE
    
    salarioPromedio number := 0;
    
    -- =======================
    --  Obtener promedio
    -- =======================
    FUNCTION obtener_promedio
    RETURN NUMBER
    IS
        promedio number :=0;
    BEGIN
        
        select avg(salario) into promedio from empleados;
        RETURN promedio;
    
    END;
    -- =========== Fin de la funcion Promedio
    
BEGIN -- Funcion PL Principal

    salarioPromedio := obtener_promedio();
    dbms_output.put_line('El salario promedio es: ' || salarioPromedio );

END;
/