'use strict';

// Nos asegura que todo el DOM sea cargado para comenzar a ejecutar el codigo JS
document.addEventListener('DOMContentLoaded', () => {
    // Accedemos al input de titulo 
    const title = document.getElementById('title');
    // Accedemos al input de descripcion 
    const description = document.getElementById('description');
    // Accedemos al button de agregar 
    const btn = document.getElementById('add');
    // Accedemos ala tabla
    const table = document.getElementById('table');
    // Accedemos al alert error
    const alert = document.getElementById('alert');
    // Creamos variable ID
    let id = 1;

    const removeTodo = (id) => {
        document.getElementById(id).remove();
    }

    // Funcion para validar que no vengan vacios Y crear los campos
    const addTodo = () => {
        if(title.value.trim() === '' || description.value.trim() === ''){
            alert.classList.remove('d-none'); // removemos la clase que mantiee oculta la alerta
            alert.textContent = 'Title and description are required'; // le agregamos texto a la alerta
            return; // retornamos para romper el if
        }
    // Si los campos no llegan vacios
        alert.classList.add('d-none'); // agregamos la clase para quitar la alerta
        //Insertamos
        const row = table.insertRow(); // creamos una constate para guardar la fila en la tabla
        row.setAttribute('id', id++); // Agregamos a la fila un atributo id que incrementa cuando se crea
        row.innerHTML =  // mostramos los valores y creamos el checkbox
        `<td>${title.value}</td>
        <td>${description.value}</td>
        <td class="text-center">
            <input type="checkbox">
        </td>                                           
        <td class="text-right">
            <button class="btn btn-primary mb-1">
                <i class="fa fa-pencil"></i>
            </button>
        </td>`;
        // Vaciamos los campos
        title.value = '';
        description.value = '';
        // CREAMOS EL BUTTON DE ELIMINAR
        const removeBtn = document.createElement('button'); // creamos el button
        removeBtn.classList.add('btn', 'btn-danger', 'mb-1', 'ml-1'); // le damos las clases
        removeBtn.innerHTML = '<i class="fa fa-trash"></i>'; // agregamos el icono
        removeBtn.onclick = (e) => {
            removeTodo(row.getAttribute('id')); //ejecutamos una funcion que elimine por id
        };
        row.children[3].appendChild(removeBtn); //agregamos el button en la posicion 3 de la fila
    }

    btn.onclick = addTodo; // llamamos a la funcion agregar

});