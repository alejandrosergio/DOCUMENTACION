function ajax_get_json(usuarioingresado)
{
    let resultado = document.getElementById("info");
    let xmlhttp;

    //Verificando el tipo de navagador con el que contamos
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
    //COMENZEMOS
    if(usuarioingresado.length === 0){
        resultado.innerHTML="";
    //COMENZEMOS
    }else{

        xmlhttp.onreadystatechange = function(){
            if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
                let datos = JSON.parse(xmlhttp.responseText);
    
                //COMENZEMOS
                let x = encontrarpersona(datos,usuarioingresado);
                let mensaje = (x === true) ? "<span style='color: green;'>Si fue encontrado</span>" : "<span style='color: red;'>No fue encontrado</span>";
                resultado.innerHTML = mensaje;
                
    
                //COMENZEMOS
            }
        }
    }
    
    xmlhttp.open("GET","datos.JSON",true);
    xmlhttp.send(); 
}

//COMENZEMOS

function encontrarpersona(objetoJSON,usuario){

    let arreglo = [];

    for(let i in objetoJSON){
        let persona = objetoJSON[i];
        arreglo.push(persona.nombre); 
    }

    return arreglo.indexOf(usuario) > -1; 

}

