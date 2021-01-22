/*  IN: ESTAN
    NOT IN: NO ESTAN */

SELECT NOMBREARTÍCULO,PRECIO FROM PRODUCTOS WHERE CÓDIGOARTÍCULO IN (SELECT CÓDIGOARTÍCULO FROM PRODUCTOSPEDIDOS WHERE UNIDADES > 20);

/* Seleccionar los campos nombre de articulo y precio de la tabla productos donde codigo articulo estan selecionados los codigos articulos de la tabla productos pedidos donde las unidades son mayores a 20 euros */

SELECT EMPRESA,POBLACION FROM CLIENTES WHERE CÓDIGOCLIENTE NOT IN (SELECT CÓDIGOCLIENTE FROM PEDIDOS WHERE FORMADEPAGO = 'TARJETA');