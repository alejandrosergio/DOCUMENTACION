"use strict";

/* 

Spread Operator (Operador de expancion)

su sintaxis es ...

*/
//SINTAXIS
    /* 
    const number = [-12, 2, 3, 23, 43, 2, 3];

    console.log(number);
    console.log(...number); // Spread Operator
    */





// ENVIAR ELEMENTOS EN UN ARRAY A UNA FUNCION
    /* 
    const addNumbers = (a,b,c) => {
        console.log(`la suma es: ${a+b+c}`);
    }

    let numberToAdd = [1,2,3];

    addNumbers(numberToAdd,2,3); // error
    addNumbers(...numberToAdd); // Spread Operator
    */





// AÑADOR UN ARRAY A OTRO ARRAY
    /* let users = ['javier', 'david', 'rosa', 'juan', 'mercedes'];
    let newUsers = ['marta', 'laura', 'jaime'];

    // users.push(newUsers[0],newUsers[1],newUsers[2]); // mucha tarea
    users.push(...newUsers); // colocarlos al final del array
    // users.unshift(...newUsers); // colocarlos al principio del array
    // users.splice(2,0...newUsers); // colocarlos en la posicion que querramos en este caso la 2 desde el 0 

    console.log(users.sort());
    */




// COPIAR ARRAYS
    /* 
    let array1 = [1,2,3,4];
    let array2 = [array1]; // copia el array en una posicion
    let array2 = [...array1]; // copia el array cada campo en su pocision
    console.log(array2);
    */


// CONCATENAR ARRAYS
    /* 
    let array1 = [1,2,3,4,5];
    let array2 = [6,7,8]; 
    // let arrayConcat = array1.concat(array2); // Una forma
    let arrayConcat = [...array1,...array2];
    console.log(arrayConcat);
    */



// ENVIAR UN NUMERO DE PARAMETROS INDEFINIDOS A UNA FUNCION (PARAMETROS REST)
    /* 
    const restParams = (...numbers) => {
        console.log(numbers);
    }

    console.log(restParams(1,2,3,4,5,6,7,8,9)); // numero de parametros indefinidos
    */


// TRABAJAR CON LA LIBRERIA MATH
    /* 
    const number = [-12, 2, 3, 23, 43, 2, 3];
    // console.log(Math.max(number)); // Error el math no calcula si esta en un array
    console.log(Math.max(...number)); // spread lo convierte en nuneros unicode y math.max ya puede calcular
    console.log(Math.min(...number));
    */


// ELIMINAR ELEMENTOS DUPLICADOS DE UN ARRAY

    const number = [-12, 2, 3, 23, 43, 2, 3];
    // console.log(new Set(number)); // lo tenemos en un objeto set
    console.log([...new Set(number)]); // nuestro array sin repetidos 
