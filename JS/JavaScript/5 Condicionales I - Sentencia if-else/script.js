/* CONDICION SIMPLE */

let num = 5;
let num2 = -5;
let num3 = 0;
let num4 = 10;
let num5 = 20;

if (num > 0) {
    console.log(`El numero ${num} es mayor que 0`);
}

/*CONDICIONAL COMPUESTO*/
if (num2 > 0) {
    console.log(`El numero ${num} es mayor que 0`);
}else{
    console.log(`El numero ${num} no ess mayor que 0`);
}

/* CONDICIONALES MULTIPLES */
if (num3 > 0) {
    console.log(`El numero ${num3} es mayor que 0`);
    }else if(num3 == 0){  
    console.log(`El numero ${num3} es igual que 0`);
        }else{
    console.log(`El numero ${num3} no es mayor que 0`);
    }       

/* OPERADORES LOGICOS */
//&& = and
//|| = ord

if (num4 > num5 || num4 == num5) {
        console.log(`El numero ${num4} es mayor a ${num5}`);
    }else if (num5 > num4 && num4 < num5) {
        console.log(`Cumple`);
}else{
    console.log("error mio XD");
}

if (num4 == 10) {
    if (num5 == 20) {
        console.log("cumplio ambas");
    }else{
        console.log("cumplio la primera");
    }
}else{
    console.log("No cumplio ninguna");
}

/*
DORIAN

if(num1>0){
    if(num2>0){
        console.log(`${num1} y ${num2} son mayores que 0`);
    }else if(num2<0){
        console.log(`${num1} es mayor que 0 y num 2 es menor que 0`);
    }else{
        console.log(`${num1} es mayor que 0 y num 2 es igual a 0`);
    }
}else if(num1<0){
    if(num2>0){
        console.log(`${num1} no es mayor que 0 y ${num2} es mayor que 0`);
    }else if(num2<0){
        console.log(`${num1} y ${num2} son menores que 0`);
    }else{
        console.log(`${num1} es menor que 0 y num 2 es igual a 0`);
    }
}else{
    if(num2>0){
        console.log(`${num1} es igual a 0 y ${num2} es mayor que 0`);
    }else if(num2<0){
        console.log(`${num1} es igual a 0 y ${num2} es menor que 0`);
    }else{
        console.log(`${num1} y ${num2} son iguales a 0`);
    }
}

let word = 'Hola';

if(word.length>4){
    console.log(`${word} tiene más de 4 letras`); 
}else if(word.length<4){
    console.log(`${word} tiene menos de 4 letras`); 
}else{
    console.log(`${word} tiene 4 letras`);
}

let respuesta = true;

if(respuesta==true) console.log(`Respuesta tiene el valor true`);
if(respuesta==false) console.log(`Respuesta tiene el valor false`);

if(respuesta) console.log(`Respuesta tiene el valor true`);
if(!respuesta) console.log(`Respuesta tiene el valor false`);

*/