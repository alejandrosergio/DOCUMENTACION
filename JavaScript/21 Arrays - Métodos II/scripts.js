/* 
Arrays - Métodos II

.from(iterable) - Convierte en array el elemento iterable

.sort([callback]) - Ordena los elementos de un array alfabéticamente(valor Unicode), si le pasamos un callback los ordena en función del algoritmo que le pasemos.

.forEach(callback(currentValue, [index])) - ejecuta la función indicada una vez por cada elemento del array.

.some(callback) - Comprueba si al menos un elemento del array cumple la condición

.every(callback) - Comprueba si todos los elementos del array cumplen la condición

.map(callback) - Transforma todos los elementos del array y devuelve un nuevo array

.filter(callback) - Filtra todos los elementos del array que cumplan la condición y devuelve un nuevo
array

.reduce(callback) - Reduce todos los elementos del array a un único valor

*/

/* FROM */  // Convierte un contenido iterable(contable) en un array;

/* let word = 'Hola mundo';

console.log(Array.from(word)); convierte el string en un array o cualquier elemento iterable
console.log(word.split(''));  convierte el string en un array
console.log(word.split(' ')); convierte un string en array, cuando encuntra espacio da nueva pocicion
*/

/* SORT */

/* 
const letters = ['b', 'c', 'z', 'a'];
const numbers = [1,8,100,300,3];

console.log(letters.sort()); Ordena las letras alfabeticamente

console.log(numbers.sort((a,b)=>a-b)); Ordena los numero de menor a mayor

console.log(numbers.sort((a,b)=>b-a)); Ordena los numero de  mayor a menor


function menorMayor(a, b) {
if (a-b < 0) return -1;
if (a-b > 0) return 1;
if(a == b) return 0;
}

function mayorMenor(a, b) {
if (b-a < 0) return -1;
if (b-a > 0) return 1;
if(b == a) return 0;
} */

/* FOREACH */ //RECORRE UN ARRAY Y LO PUEDE HACER CON SU INDICE
/* const numbers = [12, 25, 47, 84, 98]

//numbers.forEach((number)=>console.log(number));

numbers.forEach((number, index) =>
    console.log(`${number} está en la posición ${index}`)); */

/* const words = ['HTML', 'CSS', 'JavaScript', 'PHP']
console.log(words.some(word => word.length>10));
console.log(words.every(word => word.length>3)); */

/* MAP */
/* const numbers = [1, 2, 3, 4, 5] */

/* const numbers2 = numbers.map(number => number * 2)
console.log(numbers2); */

/* REDUCE */

/* const numbers2 = numbers.filter(number => number > 80)
console.log(numbers2)
console.log(numbers.reduce((a,b)=>a+b))
const users = [
    {
        name: 'user 1',
        online: true
    },
    {
        name: 'user 2',
        online: true
    },
    {
        name: 'user 3',
        online: false
    },
    {
        name: 'user 4',
        online: false
    },
    {
        name: 'user 5',
        online: false
    },
    {
        name: 'user 6',
        online: true
    }
]
const usersOnline = users.reduce((cont, user) => {
    if (user.online) cont++
    return cont
},0)
console.log(`Hay ${usersOnline} usuarios conectados`); */