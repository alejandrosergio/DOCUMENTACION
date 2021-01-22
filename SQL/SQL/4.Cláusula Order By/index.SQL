/* order by */

SELECT * FROM PRODUCTOS WHERE SECCIÓN = "CERÁMICA" OR SECCIÓN = "DEPORTES" ORDER BY SECCIÓN;

/* seleccionar todos los campos de seccion que sean igual a ceramica o  deportes ordenados por seccion */

SELECT * FROM PRODUCTOS WHERE SECCIÓN = "CERÁMICA" OR SECCIÓN = "DEPORTES" ORDER BY SECCIÓN DESC;

/* seleccionar todos los campos de seccion que sean igual a ceramica o  deportes ordenados por seccion de mayor a menor*/

SELECT * FROM PRODUCTOS WHERE SECCIÓN = "CERÁMICA" OR SECCIÓN = "DEPORTES" ORDER BY SECCIÓN, PRECIO;

/* seleccionar todos los campos de seccion que sean igual a ceramica o  deportes ordenados por seccion y luego por precio */

SELECT * FROM PRODUCTOS WHERE SECCIÓN = "CERÁMICA" OR SECCIÓN = "DEPORTES" ORDER BY SECCIÓN, PRECIO DESC;

/* seleccionar todos los campos de seccion que sean igual a ceramica o  deportes ordenados por seccion y luego por precio decendente*/



