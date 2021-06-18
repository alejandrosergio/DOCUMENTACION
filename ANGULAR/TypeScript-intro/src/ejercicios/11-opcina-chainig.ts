/*
    ===== Código de TypeScript =====
*/

// ENCADENAMIENTO OPCIONAL

interface Pasajero{
    nombre: string;
    hijos?: string[]; // ? opcional
}

const pasajero1: Pasajero = {
    nombre: "Fredy"
}

const pasajero2: Pasajero = {
    nombre: "Carlos",
    hijos: ['thomas','Laura','Simon']
}

function imprimeHijos(pasajero: Pasajero): void{

    const cuantosHijos = pasajero.hijos?.length || 0;

    console.log('El pasajero tiene: ', cuantosHijos , ' hijos. ');

}

imprimeHijos(pasajero1);