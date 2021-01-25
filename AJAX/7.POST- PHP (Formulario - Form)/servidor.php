<?php
$name = $_POST['name'];
$password = $_POST['password'];

if(empty($name) || empty($password)){
    echo "<br/><span style='color:red'>Porfavor ingrese nombre y contraseña.</span>";
}else{
    echo "<br/><span style='color:Green'>Gracias sus datos son NOMBRE: " . $name . " CONTRASEÑA: " . $password ."</span>"; 
}
?>