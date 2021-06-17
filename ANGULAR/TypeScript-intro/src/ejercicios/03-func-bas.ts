/*
    ===== Código de TypeScript =====
*/

// FUNCONES BASICAS

    // Funciones JS
    function sumar(a,b){ // -> function sumar(a: any, b: any): any
        return a+b;
    }

    const resultado = sumar ('Sergio', ' hernandez');

    console.log(resultado);


        // Funciones TSC
        function sumar2(a:number,b:number): number{ // -> function sumar2(a: number, b: number): number
            return a+b;
        }

        const resultado2 = sumar2 (10, 20);
    
        console.log(resultado2);

        function sumar3(a:number,b:number){ // function sumar3(a: number, b: number): string
            return (a + b).toString();
        }
    

        const resultado3 = sumar3 (10, 20);
    
        console.log(resultado3);


        // Funciones => TSC

        const sumarFlecha = (a:number , b:number): number => {
            return a +b ;
        }


        // OTRO EJEMPLO

        function multiplicar(numero:number, otroNumero?:number, base:number = 5):number { // primero numeros obligatorios
            return numero * base;                                                         // Segundo numeros opcionales  
        }                                                                                 // tercero numeros con valor por defecto

        const resultado4 = multiplicar(5,0,10);

        console.log(resultado4);





