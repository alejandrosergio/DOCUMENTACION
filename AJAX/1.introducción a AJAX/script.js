

function ejecutarAJAX()
{
    var ajaxRequest;  //Variable donde se almacenaran los datos.

    if(window.XMLHttpRequest){  //verificando si el navegador esta actualizado a la epoca
        ajaxRequest = new XMLHttpRequest();  //Nuevos navegadores
    }else{
        ajaxRequest = new ActiveXObject("Microsoft.XMLHTPP");  //Navegadores arcaicos
    }

    /* 
        PETICIONES DE PROCESO
    0 Petición no ha sido inicializada
    1 Petición ha sido establecida
    2 Petición ha sido enviada
    3 Petición esta siendo procesada
    4 Petición ha finalizado
    */

    let ajaxRequest = new XMLHttpRequest();  // 
    ajaxRequest.onreadystatechange = function(){
        if(ajaxRequest.readyState == 4 && ajaxRequest.status == 200){
            document.getElementById("info").innerHTML = ajaxRequest.responseText;
        }
    }

    ajaxRequest.open("POST","archivo.txt",true);
    ajaxRequest.send();
}