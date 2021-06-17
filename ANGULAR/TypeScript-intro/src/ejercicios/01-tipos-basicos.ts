
/*
    ===== Código de TypeScript =====
*/

// Variable en JS
    let nombre = 'Strider';

    const nombre3 = 'Mark'; // nos nos muestra un tipo de dato ya que las cosntantes no cambian

// Variable en TSC
    let nombre2: String = 'Strider';


// Ejemplo de tipado
    let hp: number | string = 95; // en casi que necesitemos guardar en una varible distintos tipos de datos

    // hp = 'FULL'; // Type 'string' is not assignable to type 'number'.

    hp = 'FULL'; // Le podemos decir eres number o string ...

    console.log(nombre2,hp);

// Variable booleana
    let estaVivo: boolean = true; // no hacepta 1 o 0 -> es true o false
    let estaVivo2: boolean = false;
