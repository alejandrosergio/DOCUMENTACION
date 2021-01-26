let resultado = document.getElementById("info");

function mostrarUsuarios()
{
    alert("entro");
    let xmlhttp;

    //Verificando el tipo de navagador con el que contamos
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

        xmlhttp.onreadystatechange = function(){
            if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
                resultado.innerHTML = this.responseText;
            }   

        xmlhttp.open("GET","servidor.php",true);
        xmlhttp.send(); 
    }
}
