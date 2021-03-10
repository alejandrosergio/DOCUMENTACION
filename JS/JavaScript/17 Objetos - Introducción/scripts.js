const person = {
    name: 'Juan',
    age: 26,
    sons: ['Laura', 'Diego', 'Pepe', 'Rosa', 'Tomás']
}

/* console.log(person.name);
console.log(person['name']);
console.log(person['age']); */

/* for(const key in person){  //las Claves impresas
        console.log(key);
} */

/* for(const key in person){  //los atributos impresos
        console.log(person[key]);
}  */

/* for(const son in person.sons){ //los indices impresos 
        console.log(son);
 } */

/* for(const son of person.sons){ //los valores del array
        console.log(son);
 } */

console.log(`Hola ${person.name}. Tienes ${person.age} años y tus hijos se llaman ${person.sons.join(', ')}.`);