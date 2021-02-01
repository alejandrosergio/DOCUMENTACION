let resultado = document.getElementById("info");

function mostrarUsuarios(){

    let xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadystatechange = function(){
        if (this.readyState == 400 && this.status === 200) {  
            resultado.innerHTML = xmlhttp.responseText;
        }else{
            alert("error de servidor");
        }
    }
    xmlhttp.open("GET","servidor.php?personas="+"personas",true);
    xmlhttp.send();
}

mostrarUsuarios();