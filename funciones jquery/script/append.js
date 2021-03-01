/* Texto al  Final */

$(document).ready(function(){
    $("#boton").click(function(){
        $("#parrafo").append("<br>texto añadido al final del párrafo.");
}); 
});

/* elemento al final de una lista  append con funcion*/

$(document).ready(function(){
    $("#botonn").click(function(){
        $("ul#listas li").append(function(n){
                return "--> Este elemento de la lista tiene el índice: " + n + ".";
        });
    }); 
});