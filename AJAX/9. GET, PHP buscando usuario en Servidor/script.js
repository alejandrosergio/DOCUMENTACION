let resultado = document.getElementById("info");

function mostrarSugerencia(usuario)
{
    let xmlhttp;

    //Verificando el tipo de navagador con el que contamos
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    //COMENZEMOS

    if (usuario.length === 0) {
        document.getElementById("info").innerHTML = "";
    }else{
            xmlhttp.onreadystatechange = function(){
            if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
                resultado.innerHTML = xmlhttp.responseText;
            }   
        };
        xmlhttp.open("GET","servidor.php?nombre=" + usuario,true);
        xmlhttp.send(); 
    }
}