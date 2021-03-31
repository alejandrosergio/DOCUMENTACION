'use strict';

        /* ALERTAS */

//ALERTA DENTRO DEL NAVEGADOR
/* alert("Mensaje de Alerta"); */

//VENTANA DE CONFiRMAciON
/* var result = confirm("Cuidado que vas a petear tu pc XD");
alert(result); */

//VENTANA DE iNGRESO DE DATOS
/* var res = prompt('Enserio quieres petear el pc', "Claro que si");
alert('A dicho que ' + res); */

/* function MuestraMensajes(){

    for (let i = 1; i <= 50; i++) {

        console.log("Mostrando mensaje " + i + " vez");
    }

    //SE PUEDE iMPRiMiR POR CONSOLA EL NOMBRE DE LA FUCTiON Y ()
    //PARA VER Si ES UNA FUCTiON Y QUE TiENE SOURCE Y EL NOMBRE DE LA FUCTiON POR CONSOL

} */

/* confirm("Vamos a sumar 3 numeros");
var num1 = prompt("Digita el primer numero a sumar");
var num2 = prompt("Digita el segundo numero a sumar");
var num3 = prompt("Digita el tercer numero a sumar");;

function SumaNumeros(num1,num2,num3 = undefined){
    
    if (num3 == undefined) {
        document.write("Pasaste 2 parametros");
    }else{
        let suma = parseInt(num1) + parseInt(num2) + parseInt(num3);
        alert("La suma de tres numeros es : " + suma);
    }
}

var resultado = SumaNumeros(num1,num2,num3); */


//PARAMETROS REST

/* function MuestraPaises(...p){
    for (let i = 0; i < p.length; i++) {
        
        document.write("pais N-"+(i+1)+ " es: " + p[i]+ "<br></br>");
    }
}

MuestraPaises("España", "Colombia" , "EE.UU" , "Canada" , "Nueva Zelanda", "Noruega","Ecuador"); */


//FUNCiONES ANONiMAS

/* function Sumar(num1,num2,multiplicar){
    let suma = num1 + num2;
    multiplicar(suma);
    return(suma);
}

Sumar(7,8,function(d){
    console.log("La suma es: " + d);
    console.log("La multiplicacion de la suma es: " + d * 2);
}); */

//FUN

/* function Sumar(num1,num2,fun){
    let suma = num1 + num2;
    fun(suma);
    return(suma);
}

Sumar(7,8, fun => {
    console.log("La suma es: " + fun);
    console.log("La multiplicacion de la suma es: " + fun * 2);
}); */