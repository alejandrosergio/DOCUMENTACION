let resultado = document.getElementById("info");

function ejecutarAJAX(){
    
    let arr = [];
    let xml;

    if (window.XMLHttpRequest) {
    xml = new XMLHttpRequest();
    } else {
    xml = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xml.onreadystatechange = function () {
    if (xml.readyState == 4 && xml.status == 200) {
            if (xmlhttp.responseXML !== nul) {
                arr[0] = xml.responseXML.getElementsByTagName("nombre").item(0);
                arr[1] = xml.responseXML.getElementsByTagName("apellido").item(0);
                arr[2] = xml.responseXML.getElementsByTagName("edad").item(0);
                arr[3] = xml.responseXML.getElementsByTagName("salario").item(0);

                resultado.innerHTML  =  arr[0].firstChild.nodeValue + " " +
                                        arr[1].firstChild.nodeValue + " " +
                                        arr[2].firstChild.nodeValue + " tiene " +
                                        arr[3].firstChild.nodeValue + " años y su salario es de ";
            }
        }else{
            alert("error de servidor");
        }
    }

    xml.open("GET","datos.xml",true);
    xml.send();
}