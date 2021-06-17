/*
    ===== Código de TypeScript =====
*/

    // Nuestra interface del personaje
    interface PersonajeLOR{
        nombre: string;
        pv: number;
        mostrarHP: (/*Pasamos parametros numero:number , nombre: String*/) => void; // definir funciones a una interface -> implementar a los objetos
    }

    // Nuestra function de curar
    function curar(personaje : PersonajeLOR, curarX:number):void{ // Si no quiero retornar datos
        personaje.pv += curarX;
    } 

    const nuevoPersonaje: PersonajeLOR = {
        nombre: 'Strider',
        pv: 50,
        mostrarHP(){
            console.log('Puntos de vida: ', this.pv);
        }
    }

    curar(nuevoPersonaje,20); // function curar(personaje: PersonajeLOR, curarX: number): void

    nuevoPersonaje.mostrarHP;


