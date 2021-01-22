SELECT SECCIÓN, SUM(PRECIO) FROM PRODUCTOS GROUP BY SECCIÓN;

/* seleccionamos la seccion y sumamos el precio de la tabla productos agrupados por seccion  a la que corresponden */

SELECT SECCIÓN, SUM(PRECIO) AS SUMA_ARTICULOS FROM PRODUCTOS GROUP BY SECCIÓN;

/* Cambiar el nombre de la columna con la clausula as de modo que nos permita ordenar debido ala agrupacion */

SELECT SECCIÓN, SUM(PRECIO) AS SUMA_ARTICULOS FROM PRODUCTOS GROUP BY SECCIÓN ORDER BY Suma_Articulos;

/* Agrupado correctamente */


SELECT SECCIÓN, AVG(PRECIO) AS MEDIA_ARTICULOS FROM PRODUCTOS GROUP BY SECCIÓN HAVING SECCIÓN="DEPORTES" OR SECCIÓN="CONFECCIÓN" ORDER BY MEDIA_ARTICULOS;

/* Hallando la media de los precios totales de dos tablas y ordenandolos de menor a mayor segun su valor monetario */


SELECT POBLACIÓN, COUNT(POBLACIÓN) AS SUMA_POR_POBLACION FROM CLIENTES GROUP BY POBLACIÓN ORDER BY POBLACIÓN;

/* Seleccionar la poblacion y contar cuantos hay de esa misma poblacion transformar el nombre de la tabla clientes y agruparlo por poblacion y ordenarlo de menor a mayor */


SELECT SECCIÓN,/* No pueden ir un tercero se imprime el primer registro de la tabla no el mas alto */ MAX(PRECIO) AS PRECIO_MAYOR FROM PRODUCTOS GROUP BY SECCIÓN;



SELECT SECCIÓN,/* No pueden ir un tercero se imprime el primer registro de la tabla no el mas alto */ MAX(PRECIO) AS PRECIO_MAYOR FROM PRODUCTOS WHERE SECCIÓN="CERÁMICA" GROUP BY SECCIÓN;

SELECT SECCIÓN,/* No pueden ir un tercero se imprime el primer registro de la tabla no el mas alto */ MAX(PRECIO) AS PRECIO_MAYOR FROM PRODUCTOS WHERE SECCIÓN="CONFECCIÓN" GROUP BY SECCIÓN;

SELECT SECCIÓN,/* No pueden ir un tercero se imprime el primer registro de la tabla no el mas bajo */ MIN(PRECIO) AS PRECIO_MAYOR FROM PRODUCTOS WHERE SECCIÓN="CERÁMICA" GROUP BY SECCIÓN;