/* COMANDOS SQL */

/* DDL: se encarga de la modificación de la estructura de los objetos de la base de datos. Incluye órdenes para modificar, borrar o definir las tablas en las que se almacenan los datos de la base de datos.

CREATE: se usa para crear una base de datos, tabla, vistas, etc.
ALTER: se utiliza para modificar la estructura, por ejemplo añadir o borrar columnas de una tabla.
DROP: con esta sentencia, podemos eliminar los objetos de la estructura, por ejemplo un índice o una secuencia
-TRUNCATE:
*/


/* DML: Lenguaje de Manipulación de Datos (DML)
También es un lenguaje proporcionado por los sistemas gestores de bases de datos. En inglés, Data Manipulation Language (DML).

Utilizando instrucciones de SQL, permite a los usuarios introducir datos para posteriormente realizar tareas de consultas o modificación de los datos que contienen las Bases de Datos.

Los elementos que se utilizan para manipular los datos, son los siguientes:

SELECT: esta sentencia se utiliza para realizar consultas sobre los datos.
INSERT: con esta instrucción podemos insertar los valores en una base de datos.
UPDATE: sirve para modificar los valores de uno o varios registros.
DELETE: se utiliza para eliminar las finas de una tabla */


/* DCL: Estos comandos permiten al Administrador del sistema gestor de base de datos, controlar el acceso a los objetos, es decir,  podemos otorgar o denegar permisos a uno o más roles para realizar determinadas tareas.

Los comandos para controlar los permisos son los siguientes:

GRANT: permite otorgar permisos.
REVOKE: elimina los permisos que previamente se han concedido. */


/* TCL: permiten manejar transacciones en una base de datos relacional, por lo que es importante primeramente aclarar el concepto de transacción.

COMMIT:
ROLLBACK:
SAVEPOINT:
*/

/* CLAUSULAS
    -FROM
    -WHERE
    -GROUP BY
    -HAVING
    -ORDER BY
*/


/* INSTRUCCION SQL: comando + clausula + operador  + funciones */


/* 
    PRIMERA CONSULTA: SELECT * FROM CLIENTES WHERE POBLACIÓN="MADRID"  seleccionar todos los clientes donde la poblacion sea igual a madrid
*/