SET SERVEROUTPUT ON;

DECLARE

    reg_empleado EMPLEADOS%ROWTYPE; -- Obtiene todo los campos de un registro de la tabla

BEGIN

    SELECT * INTO reg_empleado FROM EMPLEADOS WHERE ID = 5; -- Almacenamos en la variable los campos del id 5

    dbms_output.put_line('Nombre  - ' || reg_empleado.NOMBRE);
    dbms_output.put_line('ID - '  || reg_empleado.ID);
    dbms_output.put_line('SALARIO  - ' || reg_empleado.SALARIO);
    dbms_output.put_line('Actualizado - ' || reg_empleado.ACTUALIZADO);

END;
/