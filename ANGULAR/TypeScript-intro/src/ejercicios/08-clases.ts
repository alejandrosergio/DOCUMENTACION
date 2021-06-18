/*
    ===== Código de TypeScript =====
*/

// CLASES BASICAS

    //Clases


    class PersonaNormal{

        constructor(
            public nombre: string,
            public direccion: string
        ){}
    }

    // EXTENDER UNA CLASE
    class Heroe extends PersonaNormal {
        /* 
        alterEgo: String;
        edad: number;
        nombreReal: number; 
        */

        constructor( 
            
            public alterEgo: string,
            public edad: number,
            public nombreReal: string
        ){
            super(nombreReal, 'New York, EE.UU');
            /* 
            this.alterEgo = alterEgo; 
            */
        }
    }

    const iroman = new Heroe('Ironman',35,'Tony stark');

    console.log(iroman);
