<?php

    require_once("conexion.php");

    $personas = $_GET['personas'];

    $nombreID     =   "nombreID";
    $emailID      =   "emailID";
    $actualizar   =   "actualizar";
    $borrar       =   "borrar";

    if ($personas === "personas") {

        $resultado = mysqli_query($con,"SELECT * FROM personas");

        $table .= "<div class='container'>";
        $table .= "<table class='table table-striped table-bordered'>";
        $table .= "<tr>";
        $table .= "<th>USUARIO</th>";
        $table .= "<th>NOMBRE</th>";
        $table .= "<th>CORREO</th>";
        $table .= "<th>EDITAR</th>";
        $table .= "<th>ELIMINAR</th>";
        $table .= "</tr>";

        while($fila = mysqli_fetch_assoc($resultado)){
            $table .= "<tr>";
            $table .= '<td>'.$fila['usuario'].'<td/>';
            $table .= '<td id="'.$nombreID.$fila['usuario'].'">'.$fila['nombre'].'<td/>';
            $table .= '<td id="'.$emailID.$fila['usuario'].'">'.$fila['correo'].'<td/>';
            $table .= '<td><input type = "button" value = "Editar" class = "btn btn-warning"<td/>';
            $table .= '<td><input type = "button" value = "Eliminar" class = "btn btn-danger"<td/>';
            $table .= '<td><input type = "button" value = "Actualizar" class = "btn btn-success" style="display:none;"<td/>';
            $table .= "<tr>";
        }
    }

        echo $table;
        mysqli_close($con);
?>