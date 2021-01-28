<?php

    require_once("conexion.php");

    $nombre = $_POST['nombre'];
    $correo = $_POST['correo'];

    if (empty($nombre) || empty($correo)) {
        echo "<span style='color:red'> Por favor diligencia el formulario para ser enviado </span>";
    }else{
        
        $resultadoBD = mysqli_query($con," INSERT INTO personas (nombre, correo) VALUES ('$nombre','$correo')");
        echo "<span style='color:green'> Gracias ". $nombre . " sus datos fueron registrados </span>";
    }

?>
