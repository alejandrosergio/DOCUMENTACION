/*
    ===== Código de TypeScript =====
*/


// ARRAYS -> VECTORES -> ARREGLOS

    // Arreglo JS
        let habilidades = [1,'seeik',3.14,true,false,'e',[],{}]; // -> any es aceptar cualquier tipo de dato en un arreglo -> se debe evitar

    // Arreglo TSC

        let habilidades2 = ['seeik','alejandro','kathe']; // let habilidades2: string[]

        // habilidades2.push(1); // Argument of type 'number' is not assignable to parameter of type 'string'.

        let habilidades3 = ['seeik','alejandro','kathe',1]; // let habilidades2: (string | number)[]

        // Especificarlos nosotros mismos

        let habilidades4: (String | boolean | number )[] = []; // -> no recomendado

        let habilidades5: string[] = ['seeik','alejandro','kathe']; // -> recomendado

// OBJETOS

    // Trabajando con objetos

    // 1. Creamos una interface para declarar de que tipo sera cada atributo del objeto

    interface Personaje{
        nombre: string; // -> el atributo nombre sera de tipo String
        hp: number;     // -> wl atributo ph sera de tipo number
        habilidades: string[]; // -> el atributo habilidades sera un arreglo de tipo String
        publoNatal ? : string;// -> el atributo puebloNatal sera de tipo string -> el signo ? indica que es opcional el atributo
    }
    
    // 2. Creamos nuestro objeto que sea del tipo interface Personaje
    const personaje: Personaje = {
        nombre: 'Strinder',
        hp: 100,
        habilidades: ['Bash','Couter','Healing']
    }

    personaje.publoNatal = 'Pueblo paleta';


    console.table(personaje);