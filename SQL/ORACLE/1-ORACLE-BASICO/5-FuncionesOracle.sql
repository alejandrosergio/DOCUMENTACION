/* FUNCIONES PREDETERMINADAS ORACLE */

SET SERVEROUTPUT ON;
-- Permitir salidas por consola ESTANDAR -- varia su asignación


DECLARE
-- Definición de funciones y variables

    nombre nvarchar2(100) := ' Alejandro ';
    apellido nvarchar2(100) := 'Hernandez';
    nombreCompleto nvarchar2(100);
    hoy date := sysdate;
    nombre2 nvarchar2(100);


BEGIN
-- Inicio de una sentencia

    -- FUNCIONES DE TEXTO
    dbms_output.put_line('Nombre: ' || nombre);
    dbms_output.put_line('Largo del nombre: ' || length(nombre) ); -- Obtener el largo de una cadena de caracteres
    dbms_output.put_line('Trim: ' || trim(nombre) ); -- Quita los espacios del principio y el final
    dbms_output.put_line('Minusculas: ' || lower(nombre) ); -- Pasa la cadena a minusculas
    dbms_output.put_line('Mayusculas: ' || upper(nombre) ); -- Pasa la cadena a mayusculas

    dbms_output.put_line('Concatenar: ' || upper(nombre) ); -- Pasa la cadena a mayusculas

    nombre := trim(nombre); -- Quitamos los espacios

    dbms_output.put_line('Cortar: ' || substr(nombre,1,3) ); -- Pasa la cadena a mayusculas
    dbms_output.put_line('Reemplazar: ' || replace(nombre,'o','a') ); -- Remplaza en este caso la o por a - pueden ser palabras

    nombreCompleto := nombre || apellido;

    dbms_output.put_line('Nombre completo: ' || nombreCompleto );


    -- FUNCIONES DE FECHA
    dbms_output.put_line('Hoy: ' || hoy );
    dbms_output.put_line('Agregar mes: ' || (hoy+2) ); -- Agregar a la fecha de hoy dos dias
    dbms_output.put_line('Agregar mes: ' || add_months(hoy,2) ); -- Agregar a la fecha de hoy dos meses
    dbms_output.put_line('Día to_char: ' || to_char(hoy,'DD') ); -- extraer de una fecha
    dbms_output.put_line('Día Mes to_char: ' || to_char(hoy,'DD-MM') ); -- extraer de una fecha
    dbms_output.put_line('Día Mes to_char: ' || to_char(hoy,'YYYY') ); -- extraer de una fecha


    -- MAS
    dbms_output.put_line('NVL: ' || NVL(nombre2,'Variable null')); -- Si la variable es nula mandamos un mensaje

END;-- Final de una sentencia
/