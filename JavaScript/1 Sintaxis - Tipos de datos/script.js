/* 
                                "SINTAXIS DE JAVASCRIPT"

    Es case sensitive
        -Numero no es igual a numero (el programa lo toma por variables distintas ya que tiene mayusculas.)
    
    Es de tipo debil p dinamico
        -las variables son del tipo de dato almacenado

    Las sentencias finalizan con (;)
        -No es obligatorio pero es muy recomendable

    Los bloques finalizan con la llave de (})
        -De forma opcional puedes añadir un (;) despues de }
*/

/*
                        "VARIABLES Y CONSTANTES (SCOPE O ÁMBITO)"

    VARIABLE
        - Significa el espacio reservado en la memoria que tiene la capacidad de cambiar de contenido mientras se desarrolla la ejecución de algún software. La misma corresponde un área que ha sido previamente reservada en el disco duro de cualquier computadora.
        - La palabra reservada para declarar variables es (let) no se recomienda usar (var).
        - Las variables de pueden: declarar, inicializar y mosificar.

    CONSTANTE
        - Una constante es un valor que no puede ser alterado/modificado durante la ejecución de un programa, únicamente puede ser leído. Una constante corresponde a una longitud fija de un área reservada en la memoria principal del ordenador, donde el programa almacena valores fijos.
        - La palabra reservada para declarar una constante es (const)

    El (SCOPE) o (AMBITO) es la zona donde existe nuestra variable constante.
*/

/*
                        "DECLARACION, INICIALIZACION Y MODIFICACION"

    Una variable se declara con la siguiente estructura.
        - let numero; (reservado en memoria un espacio para un dato (por ahora no tiene valor)).

    Una variable inicializada con la siguiente estructura.
        - numero = 5; (Ya tiene valor la variable guardada en memoria)
    
    Se puede declarar eh inicializar en la misma sentencia.
        - let numero = 5;
    
    Para modificar este valor en cascada seria.
        numero = 3; (se puede modificar siempre y cuando estemos dentro del mismo bloque).

    Las constantes solo admiten la declaracion y la inicializacion en la misma sentencia.
        const pi = 3.14;
*/

/* 

                        TIPOS DE DATOS EN JAVASCRIPT


    TIPOS PRIMITIVOS

        Numero -> let numero = 5;

        strings (cadena) -> 'hola mundo'; let palabra = "Hello word"; (algun tipo de comillas no ambas ' ").

        Boolean -> let respuesta = true; let respuesta = false;

        Undefined.

        Null.

        Symbol.

*/

let numero = 5;
let numero1 = 2.3;
let numero2 = -4;

console.log(numero);
console.log(numero1);
console.log(numero2);

let palabra = "Hello Word";

console.log(palabra);

let respuesta = true;

console.log(respuesta);

const PI = 3.14;

console.log(PI);

numero2 = 3.2;

console.log(numero2); // Dos veces
