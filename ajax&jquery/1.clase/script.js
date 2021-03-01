$(document).ready(function(){
    $('#leer').click(function(e){ 
        e.preventDefault();
        $.get("archivo.txt" ,function(data,textStatus,jqXHR){
            console.log(data);
            console.log(textStatus);
            console.log(jqXHR);
        });
    });
    $('#leerEmpleado').click(function (e) { 
        e.preventDefault();
        $.get("empleado.json",function(data){
            console.log(data);
            $('#datosEmpleado').html(`
            Nombre: ${data.nombre} <br>
            Puesto: ${data.puesto} <br>
            Edad: ${data.edad} <br>
            `);
        });
    });
});
