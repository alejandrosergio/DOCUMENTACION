<?php

    require_once("conexion.php");

    $result = mysqli_query($con,"SELECT * FROM personas");
    $usuariosBD = "";

    
    $usuariosBD .= "<table>";
    $usuariosBD .= "<tr>";
    $usuariosBD .= "<th>ID Usuario</th>";
    $usuariosBD .= "<th>Nombre</th>";
    $usuariosBD .= "<th>Correo</th>";
    $usuariosBD .= "</tr>";

    while($row = mysqli_fetch_assoc($result)){
    $usuariosBD .= "<tr>";
    $usuariosBD .= "<td>" . $row['usuario'] . "</td>";
    $usuariosBD .= "<td>" . $row['nombre'] . "</td>";
    $usuariosBD .= "<td>" . $row['correo'] . "</td>";
    $usuariosBD .= "</tr>";
    }
    $usuariosBD .= "</table>";

    echo $usuariosBD;
    mysqli_close ($con);

?>