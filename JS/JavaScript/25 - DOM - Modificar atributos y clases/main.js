'use strict';

/* 

Atributos
    element.getAttribute('attribute');
    element.setAttribute('attribute', value);

Clases
    element.classList.add('class','class',...);
    element.classList.remove('class','class',...);
    element.classList.contains('class');
    element.classList.replace('oldClass', newClass);

    element.classList.toggle('class'[,force]);

Atributos directos
    id
    value
*/

// ATRIBUTOS
    /*  
    const title = document.getElementById('title');
    const name = document.getElementById('name');

    console.log(title);
    console.log(name);
    console.log('Es de tipo: ' + name.getAttribute('type')); 
    */

// CLASES
    /* 
    const title = document.getElementById('title');
    const name = document.getElementById('name');

    title.classList.add('other-title','agregando');
    title.classList.remove('title');

    if(title.classList.contains('agregando')){
        alert("Existe la clase");
        title.classList.replace('agregando','agregado!!');
    }else{
        alert("NO existe la clase");
    }
    */

// ATRIBUTOS DIRECTOS  

const title = document.getElementById('title');
const name = document.getElementById('name');


console.log(title.innerHTML);
console.log(title.textContent);

console.log(name.value);