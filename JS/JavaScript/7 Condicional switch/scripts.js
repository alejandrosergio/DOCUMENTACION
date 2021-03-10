/*
Sintaxis Simple
switch(evaluación) {
    case n1: 
        //código
    break;
    case n2:
        //código
    break;
    default:
         //código
}
Sintaxis Múltiple
switch(evaluación) {
    case n1:
    case n2:
    case n3:
    case n4:
        //código
    break;
    case n5:
    case n6:
        //código
    break;
    default:
         //código
} 
*/

let num = 9;

switch (num) {
    case 1:
            console.log("El valor del numero es 1");
        break;
    case 2:
            console.log("El valor del numero es 2");
        break;
    default:
            console.log("El valor del numero no es ni 1 ni 2");
        break;
} 

switch (num) {
    case 1:
    case 3:
    case 5:
            console.log("EL NUMERO ES IMPAR");
        break;
    case 2:
    case 4:
    case 8:
            console.log("EL NUMERO ES PAR");
        break;
    default:
            console.log("EL NUMERO SOBREPASO 8");
        break;
}

/* SINTAXIS DE SWITCH MULTIPLE */

let foo = 10;
let output = 'Salida: ';
switch (foo) {
    case 10:
        output += '¿Y ';
        case 1:
        output += 'Cuál ';
        output += 'Es ';
    case 2:
        output += 'Tu ';
        case 3:
        output += 'Nombre';
        case 4:
        output += '?';
        console.log(output);
    break;
    case 5:
        output += '!';
        console.log(output);
    break;
    default:
        console.log('Por favor, selecciona un valor del 1 al 6.');
}