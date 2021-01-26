let resultado = document.getElementById("info");

function mostraUsuarios()
{
    let xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadystatechange = function(){
        if (this.readyState === 4 && this.status === 200) {
            resultado.innerHTML = this.responseText;
        }
    }

    xmlhttp.open("GET","servidor.php",true);
    xmlhttp.send();
}