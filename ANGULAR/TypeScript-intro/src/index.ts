/*
    ===== Código de TypeScript =====
*/

// CLASES BASICAS

    //Clase

    class Heroe {
        /* 
        alterEgo: String;
        edad: number;
        nombreReal: number; 
        */

        constructor( 
            public alterEgo: String,
            public edad: number,
            public nombreReal: String
        ){
            /* 
            this.alterEgo = alterEgo; 
            */
        }
    }

    const iroman = new Heroe('Ironman',35,'Tony stark');

    console.log(iroman);

    //clase de TSC


    // EXTENDER UNA CLASE