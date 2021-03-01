/* Sintaxis por defecto */
/* $(selector).attr(atributo, valor); */

/* Modificar valor usando una funcion */
/* $(selector).attr(atributo,function(index,valor)); */

/* Modificar multiples valores en otros tantos atributos */
/* $(selector).attr({atributo1:valor1, atributo2:valor2,...}); */


$(document).ready(function(){
    $("#boton").click(function(){
        alert("El texto del botón es --> " + $("#boton").attr("value"));
    });
    $("#botonn").click(function(){
        $("#botonn").attr("value","OTRO TEXTO modificado");
    });
});
