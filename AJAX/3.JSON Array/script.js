
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

    //COMENZEMOS

    xmlhttp.onreadystatechange = function(){
        if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
            //alert(xmlhttp.responseText);
            let datos = JSON.parse(xmlhttp.responseText);

            if(resultado.innerHTML === ""){

                for(let i in datos){
                    resultado.innerHTML += "Su nombre es: " + datos[i].nombre + " "+ datos[i].apellido+" y su edad es " +datos[i].edad + "<hr/>" ;
                }
            }
        }
    }
    xmlhttp.open("GET","datos.JSON",true);
    xmlhttp.send();
}