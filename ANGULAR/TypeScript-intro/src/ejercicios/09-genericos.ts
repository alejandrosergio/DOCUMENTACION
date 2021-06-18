/*
    ===== Código de TypeScript =====
*/

// GENERICOS

function queTipoSoy<T>(argumento: T){
    return argumento;
}


let soyString = queTipoSoy('HolaMundo');
let soyNumber = queTipoSoy(100);
let soyArreglo = queTipoSoy([1,2,3,4,5,6,7,8,9,10]);

// Explicito colocar su valor
let soyExplicito = queTipoSoy<number>(100);