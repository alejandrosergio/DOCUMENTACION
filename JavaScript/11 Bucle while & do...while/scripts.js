/* Bucles */

/* 
    Indeterminados - No sabemos el número de veces que se va a ejecutar el código
    Bucle while
    while(condición){
        //código a ejecutar
    }    
    Bucle do...while
    do{
        //código a ejecutar
    }while(condición)
*/

let pass = '';

// El bucle no entra si se cumple la condicion, como vemos pass es igual a 'hola' y la condicion es si es distinto. se ejecutara una y otra vez hasta que se cumpla esa condicion si se cumple desde un principio no se ejecutara el bucle
while(pass != 'hola'){
    pass = prompt('Introduzca su contraseña')
}
console.log('Fin del bucle');

//El bucle se ejecutara una vez al menos, ya que la condicion esta al final, se ejecutara mientras su condicion sea lo contrario.
do{
    pass = prompt('Introduzca su contraseña')

}while(pass != 'hola')