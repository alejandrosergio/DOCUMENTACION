/* CREAR UN NUEVO CAMPO Y REFLEJADO EL ANTERIOR INCREMENTAR EL 21% DE IVA */

SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PRECIO*1.21 AS PRECIO_ARTÍCULO_IVA FROM PRODUCTOS;

/* Seleccionar nombre del articulo la seccion el precio crear un numevo campo con el 21% del campo precio cambiar el nombre al campo esto en la tabla productos */

SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, ROUND(PRECIO*1.21,3) AS PRECIO_ARTÍCULO_IVA FROM PRODUCTOS;

/* redondea con 3 numeros decimales ROUND(valor,decimales) */

SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PRECIO-3 AS PRECIO_ARTÍCULO_DESCUENTO FROM PRODUCTOS;

/* Descontando 3£ de los articulos */

SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, FECHA, NOW() AS DIA_DE_HOY FROM PRODUCTOS;

/* NOW() crea un nuevo campo arrojando la fecha y hora del dia de hoy */

SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, FECHA, NOW() AS DIA_DE_HOY,DATEDIFF(NOW(),FECHA) AS DIAS_DIFERENCIA FROM PRODUCTOS;

/* DATEDIFF(calculo,fecha) nos crea un nuevo campo con la diferencia de dias de una y otra fecha */

SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, FECHA, DATE_FORMAT(NOW(),'%D-%M') AS DIA_DE_HOY,DATEDIFF(NOW(),FECHA) AS DIAS_DIFERENCIA FROM PRODUCTOS;

/* DATE_FORMAT(fecha,'%D-%M-%Y')  dar un formato como queremos que aparezca la fecha en la consulta*/
