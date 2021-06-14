'use strict';

/* 
1 - document.getElementById('id'); // Acceder a un elemento atraves de su id

2 - document || element(el elemento) .querySelector('selectorCSS'); // Accede a todos los elementos que coicidan con el selector CSS

3 - document|| element(el elemento) .querySelectorAll('selectorCSS'); // Accede a todos los elementos que coicidan con el selector CSS, un devuelve nodeList
*/



//1
    /* 
    const title = document.getElementById('title'); // accedemos al elemento por su id lo guardamos en una vaariable
    //consol.log(title);
    title.textContent = 'DOM - Accediendo a nodos'; // alteramos la variable para cambiar el dom 
    */


//2
    /* 
    const paragraph = document.querySelector('.paragraph'); // se coloca el punto ya que es una clase
    //const paragraph = document.querySelector('.paragraph:nth-child(2)'); // para obtener uno u otro si hay varios
    //console.log(paragraph);
    const span = paragraph.querySelector('span'); // accedemos a la etiqueta no hace falta el . -> etiqueta dentro de otra

    const span2 = document.getElementById('title').querySelector('span'); // Accedemos primero al id-etiqueta y luego a la otra
    paragraph.textContent = "Alterando el contenido del primer parrafo xd's";
    */


//3
    /* 
    const paragraphs = document.querySelectorAll('.paragraph'); // seleccionamos todas las etiquetas con clase paragraph
    const paragraphsSpread = [...document.querySelectorAll('.paragraph')];  // Es mejor pero hagamos el de abajo por soporte
    const paragraphsArray = Array.from(document.querySelectorAll('.paragraph')); // convertimos en array el nodeList
    console.log(paragraphs);

    paragraphs[0].style.color = 'red'; // No se recominda cambiar los stylos asi -> busca la otra forma

    // paragraphs.map(p => p.style=color='green'); // Error por que el nodeList no es un array y el map busca un array
    paragraphsSpread.map(p => p.style.color='green');
    paragraphsArray.map(p => p.style.color='purple');
    */