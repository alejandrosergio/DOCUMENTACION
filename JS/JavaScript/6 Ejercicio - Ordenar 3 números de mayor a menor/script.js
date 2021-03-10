/* EJERCICIO */


/* SOLUCION DE SEEIK */
/* 
let numero  = 54;
let numero2 = 54;
let numero3 = 36;

if (numero < numero2 && numero < numero3) {
    if (numero != numero2 && numero != numero3) {
        if (numero2 < numero3) {
            console.log("el orden es: ");
            console.log(` ${numero}  ${numero2}  ${numero3}`);
        }else if(numero2 > numero3){
            console.log("el orden es: ");
            console.log(` ${numero}  ${numero3}  ${numero2}`);
        }else if(numero2 == numero3){
            console.log(`el numero2 = ${numero2} y el numero3 = ${numero3} son iguales no podemos dar un orden`);
        }
    }
}else if (numero2 < numero && numero2 < numero3) {
    if (numero2 != numero && numero2 != numero3) {
        if (numero < numero3) {
            console.log("el orden es: ");
            console.log(` ${numero2}  ${numero}  ${numero3}`);
        }else if(numero3 < numero){
            console.log("el orden es: ");
            console.log(` ${numero2}  ${numero3}  ${numero}`);
        }else if(numero == numero3){
            console.log(`el numero1 = ${numero} y el numero3 = ${numero3} son iguales no podemos dar un orden`);
        }
    }
}else if (numero3 < numero && numero3 < numero2) {
    if (numero3 != numero && numero3 != numero2) {
        if (numero < numero2) {
            console.log("el orden es: ");
            console.log(` ${numero3}  ${numero}  ${numero2}`);
        }else if(numero2 < numero){
            console.log("el orden es: ");
            console.log(` ${numero3}  ${numero2}  ${numero}`);
        }else if(numero == numero2){
            console.log(`el numero1 = ${numero} y el numero2 = ${numero2} son iguales no podemos dar un orden`);
        }
    }
}else if (numero2 == numero3 || numero3 == numero2) {
    console.log(`el numero2 = ${numero2} y el numero3 = ${numero3} son iguales no podemos dar un orden`);
}else if(numero2 == numero || numero == numero2){
    console.log(`el numero1 = ${numero} y el numero2 = ${numero2} son iguales no podemos dar un orden`);
}else if (numero == numero3 || numero3 == numero) {
    console.log(`el numero1 = ${numero} y el numero2 = ${numero3} son iguales no podemos dar un orden`);
}
else if (numero == numero2 && numero == numero3 && numero2 == numero3){
    console.log("Los Numeros son iguales");
}else{
    console.log("BUG detectado, consulta con el programador");
} */

/* SOLUCION DE DORIAN EJERCICIO DE EL */

/*
Ordena 3 números de mayor a menor
Permutaciones con 3 elementos
Posibilidades 3! = 3*2*1 = 6
abc - 321
acb - 312
bac - 231
bca - 132
cab - 213
cba - 123
*/

const numbers = document.getElementById('numbers');
const result = document.getElementById('result');

let a=prompt('Introduzca el primer número');
let b=prompt('Introduzca el segundo número');
let c=prompt('Introduzca el tercer número');

numbers.textContent = `Los numeros introducidos son ${a}, ${b}, ${c}`

/* Ejercicio */

if(a>=b && a>=c){
    if(b>c){
        result.textContent = `El orden es: ${a}, ${b}, ${c}`
    }else{
        result.textContent = `El orden es: ${a}, ${c}, ${b}`
    }
}else if(b>=a && b>=c){
    if(a>c){
        result.textContent = `El orden es: ${b}, ${a}, ${c}`
    }else{
        result.textContent = `El orden es: ${b}, ${c}, ${a}`
    }
}else if(c>=a && c>=b){
    if(a>b){
        result.textContent = `El orden es: ${c}, ${a}, ${b}`
    }else{
        result.textContent = `El orden es: ${c}, ${b}, ${a}`
    }
}
