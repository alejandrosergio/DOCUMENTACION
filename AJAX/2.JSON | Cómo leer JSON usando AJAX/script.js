
let resultado = document.getElementById("info");

function ajax_get_json()
{
    let xmlhttp;

    //Verificando el tipo de navagador con el que contamos
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadystatechange = function(){
        if(xmlhttp.readyState === 4 && xmlhttp.status === 200){
            let datos = JSON.parse(xmlhttp.responseText);
            //console.log(datos);

            if(resultado.innerHTML === ""){
                for(let i in datos){
                    resultado.innerHTML += i + ": " + datos[i] + "<br/>"
                }
            }
        }
    }
    xmlhttp.open("GET","datos.JSON",true);
    xmlhttp.send();
}