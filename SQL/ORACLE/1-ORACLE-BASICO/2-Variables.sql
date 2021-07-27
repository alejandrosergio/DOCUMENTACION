/* VARIABLES ORACLE */

SET SERVEROUTPUT ON;
--Permitir salidas por consola ESTANDAR -- varia su asignación


DECLARE
--Definición de funciones y variables
    salario number := 2500; -- Almacena numeros = inicializamos el valor
    nombreEmpleado nvarchar2(100); -- Almacena texto (longitud del texto)
    activo boolean; -- Almacena un boleano
    fecha date; -- Almacena una fecha
    fecha2 date;

BEGIN
--Inicio de una sentencia

    nombreEmpleado := 'Alejandro Hernández';
    activo := true;
    fecha := sysdate; -- Toma la fecha de la base de datos - sistema
    fecha2 := '19-OCT-21';


    dbms_output.put_line('Nombre: ' || nombreEmpleado);
    --Imprimir por consola
    dbms_output.put_line('Salario: ' || salario);
    dbms_output.put_line('Fecha: ' || fecha);
    dbms_output.put_line('Fecha: ' || fecha2);
    dbms_output.put_line('Activo: ' || case when activo then 'si' else 'no' end ); -- CONDICIÓN IF ELSE


END; -- Final de una sentencia
/ 