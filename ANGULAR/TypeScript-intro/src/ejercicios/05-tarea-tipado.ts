/*
    ===== Código de TypeScript =====
*/

interface SuperHeroe{ // Interface del SuperHeroe
    nombre: string;
    edad:number;
    direcciion: Direcciion;
    mostrarDireccion:() => String;
    };

interface Direcciion{ // Interface del Direccion -> agregamos dentro de otra interface
    calle: string;
    pais: string;
    ciudad: string;
    }

const superHeroe:SuperHeroe = {  // Nuestro objeto superHeroe
    nombre: 'SpiderMan',
    edad: 30,
    direcciion: {
        calle: 'Main St',
        pais: 'USA',
        ciudad: 'NY'
    },
    mostrarDireccion(){
        return this.nombre + ', ' + this.direcciion.ciudad + ', ' + this.direcciion.pais;
    }
}

const direccion = superHeroe.mostrarDireccion();

console.log(direccion);