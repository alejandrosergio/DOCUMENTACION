'use strict'; // Para llevar unas buenas practicas en el JS

/* Diferencia entre var y let */

/* var mantiene el valor de su variable y la podemos cambiar por un bloque con let y pueda seguir con su contenido principal */

var num = 25;

console.log(num);

if (true) {
    let num = 20;
    console.log(num);
}

console.log(num);

if(!(num > 25 && num < 30)){
    alert("esta en el rango");
}else{
    alert("no esta en el rango");
}

if(num > 25 && num < 30){
    alert("esta en el rango");
}else{
    alert("no esta en el rango");
}

for (let i = 0; i <= 100; i++) {
        console.log("N:" +i);
}