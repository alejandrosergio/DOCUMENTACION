let resultado = document.getElementById("info");

function ajax_post()
{
    let xmlhttp;

    //Verificando el tipo de navagador con el que contamos
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

            //COMENZEMOS
            let a = document.getElementById("name").value;
            let b = document.getElementById("password").value;
            let informacionUsuario = "name="+ a +"&password=" + b;
            //COMENZEMOS

    xmlhttp.onreadystatechange = function(){
        if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
            //COMENZEMOS
            let mensaje = xmlhttp.responseText;
            resultado.innerHTML = mensaje;
            //COMENZEMOS
        }
    }
    xmlhttp.open("POST","servidor.php",true);
    //COMENZEMOS
    xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    xmlhttp.send(informacionUsuario);
}