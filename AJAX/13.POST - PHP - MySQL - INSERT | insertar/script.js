let resultado = document.getElementById("info");

function ajax_post()
{
    
    let xmlhttp;

    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

        let a = document.getElementById("nombre").value;   
        let b = document.getElementById("correo").value;
        let informacionUsuario = "nombre=" + a + "&correo=" + b;

    xmlhttp.onreadystatechange = function(){
        if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
            resultado.innerHTML = xmlhttp.responseText; 
        }
    }

    xmlhttp.open("POST","servidor.php",true);
    xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xmlhttp.send(informacionUsuario);

}