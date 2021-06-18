/*
    ===== Código de TypeScript =====
*/


// DESESTRUCTURACION DE ARGUMENTOS

export interface Productos{ // CREAMOS INTERFACE PRODUCTOS // SE EXPORTA PARA EL ARCHIVO 09-EXPORTACIOeNIMPORTACION
    desc: String;
    precio: number;
}

const telefono: Productos = { // CREAMOS EL PRODUCTO NUMERO UNO DE TIPO PRODUCTO INTERFACE
    desc: 'Nokia a1',
    precio: 150
}

const tablet: Productos = { // CREAMOS EL PRODUCTO NUMERO DOS DE TIPO PRODUCTO INTERFACE
    desc: 'Ipad air',
    precio: 350
}


export function calculaISV( productos: Productos[]):[number, number] { // CREAMOS FUNCTION DE TIPO PRODUCTO INTERFACE EN MODO ARRAY 2 POSICIONES
    let total = 0;                                              //  EL ARRAY ES DE TIPO NUMBER EN SUS DOS POSICIONES

    productos.forEach(({precio}) => { // FOREACH QUE SE EJECUTA MUENTRAS EXISTAN PRODUCTOS -> SACAMOS SOLO EL PRECIO QUE PERTENECE A PRODUCTO
        total += precio; // HACEMOS LOS CALCULOS
    });

    return [total, total * 0.15]; // RETORNAMOS UN ARRAY CON EL TOTAL Y EL ISV QUE ES * 0.15

}

const articulos = [telefono, tablet]; // CREAMOS UN ARRAY ARTICULOS QUE ES EL QUE ENVIAMOS A LA FUNCION CON 2 PRODUCTOS

const [total, isv] = calculaISV(articulos); // CREAMOS LA CONSTANTE QUE GUARDA EN UN ARREGLO DOS ATRIBUTOS Y LA IGUALAMOS A LA FUNCION

console.log('Total: ', total);
console.log('ISV: ', isv);      // IMPRIMIMOS LOS RESULTADOS