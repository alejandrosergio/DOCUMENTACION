/* TAREA 1 */

SET SERVEROUTPUT ON; -- Sentencia para poder imprimir por consola

DECLARE -- Sentencia para declarar variables

TYPE notasArray IS varray(4) of number;  -- Declaramos el array de 4 posiciones de tipo numerico
notas notasArray := notasArray(95, 60, 75, 85); -- inicializamos el array en una variable notas

promedio number(5,2) := 0; -- Declaramos la variable promedio de tipo numerico que almacena cinco reales y dos coma flotantes


BEGIN -- Sentencia PL para ejecutar la logica del programa

    << ciclo_promedio >> -- Marcador del bucle
    FOR i IN 1..4 LOOP -- Inicializamos un ciclo de corra 4 veces

        promedio := promedio + notas(i); -- Sumamos cada uno de los posiciones del array

    END LOOP ciclo_promedio; -- Terminamos el ciclo despues de 4 repeticiones

    promedio := promedio / 4; -- Sacamos el promedio de las 4 notas

    dbms_output.put_line('El promedio es: ' || promedio ); -- Imprimimos por consola el resultado

END; -- Final de la sentencia -- Logica del programa
/