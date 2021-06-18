/*
    ===== Código de TypeScript =====
*/

// DECORADORES DE CLASE


function ClassDecorator<T extends { new (...args: any[]): {} }>(
    constructor: T
    ){
    return class extends constructor {
    reportingURL = "http://www...";
    hello  = "override";
    };
}

@ClassDecorator
class MisuperClase{

    public miPropiedad: string = 'ABC123';

    imprimir(){
        console.log('Hola Mundo');
    }
}

console.log(MisuperClase);

const miClase = new MisuperClase();

console.log(miClase.miPropiedad);