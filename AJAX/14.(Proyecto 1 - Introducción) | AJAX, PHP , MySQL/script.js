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