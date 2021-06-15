'use strict';

/* 
EVENTOS DE RATON
    click - cuando pulsamos el botton izquierdo del raton
    dblclick - cuando pulsamos dos veces seguidas el botton izquierdo del raton
    mouseenter - cuando entramos en la zona que tiene el evento
    mouseleave - cuando salimos de la zona que tiene el evento 
    mousedown - cuando pulsamos y no soltamos el button izquiero del rató 
    mouseip -  cuado soltamos el button izquierdo del raton 
    mousemove - cuando movemos le raton 

EVENTOS DE TECLADO 
    keydown - cuando pulsamos una tecla
    keyup - cuado soltamos una tecla
    keypress - cuando pulsamos una tecla y no la soltamos
*/


/* General para el llamado y ejecucion de un evento */

// Llamado
const button = document.getElementById('button');
const box = document.getElementById('box');
const input = document.getElementById('input');


/* 
// CLICK -CLICK
    button.addEventListener('click', () => {
        console.log('CLICK');
    });
*/


/*
//DBLCLICK - DOBLE CLICK 
button.addEventListener('dblclick', () => {
    console.log('CLICK');
});
*/

/* 
//MOUSEENTER
box.addEventListener('mouseenter', () => {
    box.classList.add('color');
});

//MOUSELEAVE
box.addEventListener('mouseleave', () => {
    box.classList.remove('color');
});  
*/

/* 
//MOUSEDOWN
box.addEventListener('mousedown', () =>{ 
    console.log("has pulsado en la caaja");
});  

//MOUSEUP
box.addEventListener('mouseup', () =>{ 
    console.log("has soltado la caaja");
});  
*/

/* 
//MOUSEMOVE
box.addEventListener('mousemove', () => {
    console.log("Estas moviendo el raton en la caja");
});
*/


/* 
//KEYDOWN
input.addEventListener('keydown', () => {
    console.log("Has pulsado una letra");
});

//KEYUP
input.addEventListener('keyup', () => {
    console.log("Has soltado una letra");
});

//KEYPRESS
input.addEventListener('keypress', () => {
    console.log("estas pulsado una letra");
});
*/