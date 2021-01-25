let resultado = document.getElementById("info");

function ejecutarAJAX()
{
    let xmlhttp;

    //Verificando el tipo de navagador con el que contamos
    if(window.XMLHttpRequest){
        xmlhttp = new XMLHttpRequest();
    }else{
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    //COMENZEMOS

        let n1 = document.getElementById("n1").value;
        let n2 = document.getElementById("n2").value;
        
        let cadena = "num1=" + n1 +"&num2=" + n2;  

    //COMENZEMOS
    
    xmlhttp.onreadystatechange = function(){
        if (xmlhttp.readyState === 4 && xmlhttp.status == 200){
            resultado.innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET","servidor.php?" + cadena, true);
    xmlhttp.send();     
}
