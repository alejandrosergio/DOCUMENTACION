/* Para pedir un dato al usuario se puede usar prompt(mensaje) */

//prompt('Introduzca su nombre');

/* Para imprimir un dato se puede usar console.log(dato) */

//console.log(dato);

/* RESPUESTAS DE SEEIK */

//respuesta 1

/* alert("respuesta 1");
let nombre=prompt('Introduzca su nombre');
let edad=parseInt(prompt('Introduzca Su edad'));

console.log(`Hola ${nombre}, tienes ${edad} años y el año que viene tendrás ${edad+1} años`); */

//respuesta 2
/* 
alert("respuesta 2");

let figura = '';
let aux = 0;

do {

    let figura=prompt("¿A que figura deceas calcular su área?");

    if (figura.toLowerCase().trim() == "triangulo") {
        
        let base=parseInt(prompt("Dijita la base del Triangulo"));
        let altura=parseInt(prompt("Dijita la Altura del Triangulo"));
        let respuesta = base * altura / 2;
        alert("El area del Triangulo es: " + respuesta);
        break;

    }else if (figura.toLowerCase().trim() == "circulo") {

        let radio=parseInt(prompt("Dijita el 'Radio al cuadrado' del Triangulo"));
        let respuesta = Math.PI * radio;
        alert("El area del Circulo es: " + respuesta);
        break;

    }else if (figura.toLowerCase().trim() == "rectangulo") {

        let base=parseInt(prompt("Dijita la base del Rectangulo"));
        let altura=parseInt(prompt("Dijita la Altura del Rectangulo"));
        let respuesta = base * altura;
        alert("El area del Circulo es: " + respuesta);
        break;

    }else{
        alert("Su figura geometrica no fue encontrada, intentalo de nuevo");
    }

} while (aux == 0);

 */

//respuesta 3

/* alert("respuesta 3");

    let num = parseInt(prompt("Dijita el numero final a calcular"));

    for (let i = 1; i <= num; i++) {

        if (i % 2 == 0) {
            console.log(`${i} -Es Par `);
        }else{
            console.log(`${i} -Es Impar `);
        }
    } */



//respuesta 4

/* alert("respuesta 4");
    let num = '';
    let aux = 0;
do {

    let num = parseInt(prompt("Digita un numero mayor a 1"));

    if (num >= 1) {
        for (let i = num; i == 1 ; i--){
            
            if (respuesta == 0) {
                alert("El numero es primo");
            }else{
                alert("El numero no es primo");
            }
        }
        
    }else{
            alert("El numero es menor a 1 -.-");
    }
} while (aux == 0); */

//respuesta 5

/*alert("respuesta 5");

let num = parseInt(prompt("Digita un numero mayor a 0 para calcular su !factorial :"));

    if (num >= 1) {
        let factorial = num;
        for (let i = num-1; i >= 1; i--) {
            factorial = factorial * i;
        }
        alert("El factorial del numero " + num + " es " + factorial);
    }else{
        alert("El numero no es mayor a 0 -.-");
    }
*/

//respuesta 6
/* 
alert("respuesta 6");

let num;
let suma = 0;
let iterador = 0;

while(suma <= 50){
    num = parseInt(prompt("Digita un numero menor a 50: "));
    suma = suma + num;
    iterador++;
}

console.log("El total acomulado es: " + suma);
console.log("El total de numeros introducidos fueron: " +iterador+ " veces");
*/

//respuesta 7

alert("respuesta 7");
