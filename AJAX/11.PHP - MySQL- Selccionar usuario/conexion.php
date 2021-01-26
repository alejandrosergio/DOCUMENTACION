<?php
$mysql_host = 'localhost';
$mysql_user = 'root';
$mysql_pass = '';
$mysql_db = 'AJAX';

$con = mysqli_connect($mysql_host,$mysql_user,$mysql_pass,$mysql_db);

    if (mysqli_connect_errno()) {
        echo "Error con la conexion " . mysqli_connect_error();
    }else{
        echo "Conectado";
    }

?>