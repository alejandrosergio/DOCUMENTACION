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
        if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
            let datos = JSON.parse(xmlhttp.responseText);

            //COMENZEMOS

            if(resultado.innerHTML === ""){
                for(let i in datos){
                    resultado.innerHTML += "<h3>" + i + "<h3/>";

                    let persona = datos[i];

                    for(let j in persona){

                        resultado.innerHTML += j + ": " + persona[j] + "<br/>";
                    }
                }
            }

            //COMENZEMOS
        }
    }
    xmlhttp.open("GET","datos.JSON",true);
    xmlhttp.send(); 
}