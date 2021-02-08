<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php

        /* Mostrar errores de PHP */
        /* ini_set('display_errors', 1);
        ini_set('display_startup_errors', 1);
        error_reporting(E_ALL); */
        /* Mostrar errores de PHP */

        require_once("vehiculos.php");

        $coche = new Coche();
        $camion = new Camion();

        echo "El coche tiene: " . $coche->get_ruedas() . " ruedas</br>";
        echo "El camion tiene: " . $camion->get_ruedas() . " ruedas</br>";

        echo "el coche tiene un motor de " . $coche->get_motor()."</br>";
        echo "el camion tiene un motor de " . $camion->get_motor()."</br>";
    ?>
</body>
</html>