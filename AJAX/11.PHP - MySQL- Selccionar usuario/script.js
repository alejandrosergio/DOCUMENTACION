let resultado = document.getElementById("info");

function muestraUsuario(usuarioSeleccionado)
{
    let xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    if (usuarioSeleccionado === "") {
        resultado.innerHTML = "";
    }else{
        xmlhttp.onreadystatechange = function(){
            if (this.readyState === 4 && this.status === 200) {
                resultado.innerHTML = this.responseText;
            }else{
                alert("error de servidor");
            }
        }
    }

    xmlhttp.open("GET","servidor.php?usuario="+usuarioSeleccionado,true);
    xmlhttp.send();
}