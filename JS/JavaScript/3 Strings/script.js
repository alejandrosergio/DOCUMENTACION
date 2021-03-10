/* 
                METODOS Y PROPIEDADES DE LOS STRING

    Metodos: Es todo aquello que la cadena puede hacer. Ej: convierte en mayusculas.

    Propiedad: Son las caracteristicas que la cadena tiene por ser una cadena.EJ: longitud.

        Se emplean usando la nomenclatura del:
            cadena.metodo
            cadena.propiedad.
*/

//strings
    let cadena = "hola mundo";
    let cadena2 = "HELLO WORD";

/*PROPIEDADES*/

//length -> devuelve la longitud de la cadena.

    //console.log(cadena.length);

/* METODOS
    todos los metodos devuelven una cadena nueva, la cadena original no sera modificada.
*/

//toUpperCase() -> Devuelve la cadena en mayusculas.

    //console.log(cadena.toUpperCase());

//si queremos guardar la variable en mayuscula

    //let cadenaMayus = cadena.toUpperCase();
    //console.log(cadenaMayus);

//toLowerCase() -> Devuelve la cadena en minuscula.

    //console.log(cadena.toLowerCase()); 

//indexOf(string) -> Devuelve la posicion en la que se encuentra  el string, si no lo encuentra devuelve -1.

    //console.log(cadena.indexOf('hola')); //encuentra la primera concidencia o tambien puedes buscar una sola letra de la cadena.

//replace(valor a buscar, valor nuevo) -> Remplaza el fragmento de la cadena  que le digamos y pone el valor nuevo.

    //console.log(cadena.replace('mundo','Youtube'));

//substring(inicio[,fin]) -> Extrae los caracteres desde inicio hasta fin (el final no se incluye) Si no se incluye el fin extrae hasta  el final.
    //console.log(cadena.substring(3));
    //console.log(cadena.substring(3,7));//extrae hasta el caracter 3 y desde el 7

//slipce(inicio[,fin]) -> Igual que subtring pero  admite valores negativos, si ponemos valores negativos empezara desde atras.
    //console.log(cadena.slice(-3));
    //console.log(cadena.slice(0,-6));

//trim()-> elimina los espacios al inicio y al final de la cadena

    /* let cadena3 = "        Hola youtube estamos trabajando con cadenas";
    console.log(cadena3.trim()); */

//--ES6--

//startsWith(valor inicio[,longitud]) -> sirve para saber  si la cadena  empieza  con el valor. Devuelve  true o false

    /* console.log(cadena.startsWith('h'));
    console.log(cadena.startsWith('h'));
    console.log(cadena.startsWith('m',5)); */


//endsWith(valor inicio[,longitud]) -> sirve para saber  si la cadena  termina  con el valor. Devuelve  true o false

    /* console.log(cadena.endsWith('o'));
    console.log(cadena.endsWith('a',4));
    console.log(cadena.endsWith('a',4));
    console.log(cadena.endsWith('mundo')); */

//includes(valor[,inicio]) -> igual que indexOf pero devuelve true o false.

    /* console.log(cadena.includes(' ',4));
    console.log(cadena.includes('m',5));
    console.log(cadena.includes('l',3)); */
    
//

//repeat(valor) -> repite el string el numero de veces que indiquemos

    /* let cadena4 = "hola";
    console.log(cadena4.repeat(3));
    console.log("holi ".repeat(3));
 */

//templete string

let nombre = "sergio";
let apellido = "hernandez";
let edad = "19";

console.log("hola "+nombre+" "+apellido+" "+"tienes "+edad+" años"); // normal   


console.log(`hola ${nombre} ${apellido} el año que viene tendras ${edad} años`);

