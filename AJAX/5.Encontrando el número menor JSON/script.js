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

            let edadMenor = encontrarEdadMenor(datos);
            resultado.innerHTML += "La edad menor es: " + edadMenor;

            //COMENZEMOS
        }
    }
    xmlhttp.open("GET","datos.JSON",true);
    xmlhttp.send(); 
}

//COMENZEMOS

function encontrarEdadMenor(objetoJSON)
{

    let arreglo = [];

    for(let i in objetoJSON){
        let persona = objetoJSON[i];
        arreglo.push(persona.edad);
    }

    /* let edadMenor = arreglo[0];

    for(let j = 0; j < arreglo.length; j++){
        if(arreglo[j] < edadMenor)

        edadMenor = arreglo[j];
    } */

    let edadMenor = Math.min.apply(null,arreglo);
    /* let edadMenor = Math.max.apply(null,arreglo); */ //max: mayor

    return edadMenor;

}

