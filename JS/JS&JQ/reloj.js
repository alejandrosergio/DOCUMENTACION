'use strict';

/* FECHA RELOJ */

var fecha = new Date(); // se crea la clase

var hora3 = " " + fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds();


/* PRiMERA PARTE DEL DiV */

var hora = document.querySelector('#Hora'); 

var hora2 = document.querySelector('#hora2');

function muestraHora(){
    hora2.innerHTML = hora3;
}

setTimeout(muestraHora,1000);



/* SEGUNDA PARTE DEL BUTTON */

var horaCompleta = document.querySelector('#VerHora');
var Hora = document.querySelector('#Hora22');

horaCompleta.addEventListener('click' , ()=> {
    Hora.innerHTML = hora3;
});


