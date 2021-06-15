'use estrict';

const form = document.getElementById('form');
const input = document.getElementById('input');
const button = document.getElementById('button');
const facebook = document.getElementById('facebook');

/* 
form.addEventListener('keyup', (e) => {
    // console.log(input.value);
    //console.log(e.key);
    //console.log(e);
    console.log(e);
}); 
*/

/*
// WINDOW.
addEventListener('click', (e) => {
    // console.log(input.value);
    console.log(e);
}); 
*/

/* button.addEventListener('click', (e) => {
    console.log(e.target);
}); */

/* 
const gallery = document.getElementById('gallery');
const gallery_item = document.getElementsByClassName('gallery__item');

gallery.addEventListener('click', (e) => {
    e.target.classList.add('color');
}); 
*/


facebook.addEventListener('click', (e) => {
    e.preventDefault();
});

form.addEventListener('submit', (e) => {
    console.log("El formulario se envio con exito!!");
    e.preventDefault();
});

button.addEventListener('click', (e) => {
    input.value = "Has echo click";
});

button.click();