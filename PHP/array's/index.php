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

        //////////////////////////////// //////////////////////////////////

        /* Array Indexado */

        /* //Indices opcionales
        $semana [0] = "lunes";
        $semana [1] = "martes";
        $semana [2] = "miercoles";

        echo $semana[0]; 
        */

        //////////////////////////////// //////////////////////////////////

        /* El array igualmente indexado pero lo conozco*/

        /* $semana=array("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo",7);

        echo($semana[7]); */


        //////////////////////////////// //////////////////////////////////

        /* Array asociativo */

        /* $datos = array("nombre" => "sergio" , "apellido" => "Hernandez" , "edad" => 20);

        echo($datos["apellido"]); */

        //////////////////////////////// //////////////////////////////////

        /* Comprovemos si es un array o una variable */

        /* $datos = "sergio";

        if (is_array($datos)) {
            
            echo("Es un array");
        }else{
            echo("No es un array");
        } */

        //////////////////////////////// //////////////////////////////////

        /* Recorrer un array */

        /* $datos = array("nombre" => "sergio" , "apellido" => "Hernandez" , "edad" => 20);

        foreach($datos as $key => $valor){
            echo("A $key le corresponde $valor </br>");
        } */

        /* $semana=array("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo",7);

        for ($i=0; $i < count($semana) ; $i++) { 
            
            echo("$semana[$i] </br>");
        } */

        /* Agregar elemento mas al array */

        /* $semana [] = "Enero";

        echo $semana[8]; */

        /* $datos["pais"] = "colombia"; */

        //////////////////////////////// //////////////////////////////////

        /* Ordenar elementos en un array alfabeticamente */

        $semana=array("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");

        sort($semana);

        $numeros=array(9,1,8,2,7,3,6,4,5);

        sort($numeros);

        for ($i=0; $i < count($semana) ; $i++) { 
            
            echo($semana[$i]. "</br>");
        }

        for ($i=0; $i < count($numeros) ; $i++) { 
            
            echo($numeros[$i]. "</br>");
        }
    ?>
</body>
</html>