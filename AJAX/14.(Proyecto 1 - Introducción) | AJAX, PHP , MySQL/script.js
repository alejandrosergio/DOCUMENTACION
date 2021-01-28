let resultado = document.getElementById("mostrar");

function mostrarClientes(){

    let xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadystatechange = function(){
        if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
            resultado.innerHTML = xmlhttp.responseText;
        }
    }

    xmlhttp.open("GET","servidor.php",true);
    xmlhttp.send();

}

function mostrarUsuario(nombre){

    let xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadystatechange = function(){
        if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
            resultado.innerHTML = xmlhttp.responseText;
        }
    }

    xmlhttp.open("GET","servidor.php?nombre="+nombre,true);
    xmlhttp.send();

} 

function toggleOverlay(elemento){

    let overlay = document.getElementById("overlay");
    let informacionDelUsuario = document.getElementById("informacionDelUsuario");
    let info = document.getElementById("info");

    overlay.style.opacity = .6;

    if (overlay.style.display == "block") {
        overlay.style.display = "none";
        informacionDelUsuario.style.display == "none";
    }else{
        overlay.style.display == "block";
        informacionDelUsuario.style.display == "block";
    }

    let nombre = elemento.innerHTML;
    let correo = elemento.nextSibling.value;
    
    info.innerHTML   =  "<strong>Nombre: </strong>" +nombre + "<br/>" +
                        "<strong>Correo: </strong>" +correo + "<br/>";
}