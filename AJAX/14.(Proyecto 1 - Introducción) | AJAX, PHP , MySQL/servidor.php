<?php 
require_once("conexion.php");

$nombre = $_GET["nombre"];


if(!empty($nombre)){

    $cliente = mysqli_real_escape_string($con, $nombre);
    $resultado = mysqli_query($con, "SELECT * FROM personas WHERE nombre LIKE '%".$cliente."%'");

while($fila = mysqli_fetch_assoc($resultado)){

    echo '<div class="miClase" onclick="toggleOverlay(this)">' .$fila['nombre'] . '</div>';
    echo '<input type="hidden" value="'.$fila['correo'].'">';

    }
    mysqli_close($con);

}else{
    mostrarUsuarios();
}


function mostrarUsuarios()
{
    require "conexion.php";

    $resultado = mysqli_query($con, "SELECT * FROM personas");

while($fila = mysqli_fetch_assoc($resultado)){

    echo '<div class="miClase" onclick="toggleOverlay(this)">' .$fila['nombre'] . '</div>';
    echo '<input type="hidden" value="'.$fila['correo'].'">';
    }
        mysqli_close($con);
}

?>

