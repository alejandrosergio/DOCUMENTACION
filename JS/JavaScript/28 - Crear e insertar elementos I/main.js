'use estrict';

// DOM - Crear e insertar elementos I

/* 

Crear un elemento: document.createElemet(element);
Escribir texto en un elemento: element.textContent = texto.
Escribir HTML en un elemento: element.innerHTML = codigo HTML.

Añadir un elemento al DOM: parent.appendChild(element);

fragmento de codigo: document.createDocumentFragment();
*/

const days = ['Seleccione...','Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];

const title = document.getElementById('title');
const daysList = document.getElementById('daysList');
const daysSelect = document.getElementById('daysSelect');
/* 
// CREEMOS
    //cremos la lista
    const itemList = document.createElement('LI');
    //agregamos contenido a la lista
    itemList.textContent = 'Lunes';
    //agregar elemento al ul
    daysList.appendChild(itemList);
// TERMINAMOS
*/


// CREAR CON ETIQUETAS HTML
title.innerHTML = 'DOM - <span>Crear e insertar elementos I</span>'

// Añadir todos los elementos a la lista - NO HACER

/* 
for(const day of days){
    daysList.innerHTML += `<li>${day}</li>`;
} 
*/

/* 
// COMO SE HACE
const fragment = document.createDocumentFragment();

for(const day of days){
    const itemList = document.createElement('LI');
    itemList.textContent = day;
    fragment.appendChild(itemList);
}

daysList.appendChild(fragment);
// Terminamos
*/

// COMO SE HACE
const fragment = document.createDocumentFragment();

for(const day of days){
    const selectItem = document.createElement('option');
    selectItem.setAttribute('value', day.toLowerCase());
    selectItem.textContent = day;
    fragment.appendChild(selectItem);
}

daysSelect.appendChild(fragment);
// Terminamos