<?php

    require_once("conexion.php");

    $nombre = $_GET['nombre'];

    if (!empty($nombre)){
        $persona = mysqli_real_escape_string($con,$nombre);
        $resultadoBD = mysqli_query($con, "SELECT * FROM personas WHERE nombre LIKE '%".$persona."%'");

        while($fila = mysqli_fetch_assoc($resultadoBD)){
            echo "<span style='color: green; '>".$fila['nombre'] . "</span><br/> ";
        }
    }


    mysqli_close ($con);
?>