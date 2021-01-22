/* UNION: nos permite unir tablas que posean los mismos campos y tengan sus tipos de datos iguales o compatibles entre ellos, debes seleccionar los mismos campos a consultar o dara error
    -Si hay registros repetidos los muestra una sola vez*/

SELECT * FROM PRODUCTOS WHERE SECCIÓN='DEPORTES' UNION SELECT * FROM ProductosNuevos WHERE SECCIÓN='DEPORTES DE RIESGO';

SELECT * FROM PRODUCTOS WHERE PRECIO > 300 UNION SELECT * FROM ProductosNuevos WHERE SECCIÓN='ALTA COSTURA';

SELECT * FROM PRODUCTOS WHERE PRECIO > 300 UNION SELECT * FROM ProductosNuevos WHERE SECCIÓN='ALTA COSTURA' ORDER BY SECCIÓN,PRECIO

/* UNION ALL:  LO MISMO PERO:  
        -Siempre mustra la cantidad de veces que se repite*/

SELECT * FROM PRODUCTOS WHERE SECCIÓN='DEPORTES' UNION ALL SELECT * FROM ProductosNuevos WHERE SECCIÓN='DEPORTES DE RIESGO' ORDER BY CÓDIGOARTÍCULO,SECCIÓN,PRECIO