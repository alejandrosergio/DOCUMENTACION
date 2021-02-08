<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Function</title>
</head>
<body>
    <?php

        /* $palabra="SERGIO";
        $palabra2="katherine";

        echo(strtolower($palabra));
        echo(strtoupper($palabra2));

        function suma($num1,$num2){
            $total=$num1+$num2;
            return $total;
        }

        echo "</br>La suma es: " . suma(25,5); */

        ///////////////////////////////             ///////////////////////////////

        /* function mayuscula($palabra){

            $resultado = strtoupper($palabra);
            return $resultado;
        }

        echo "</br> Palabra transformada a mayuscula: " . mayuscula("hola mundo , hello word");

        function primera($palabra){

            $resultado = ucfirst($palabra);
            return $resultado;
        }
        
        echo "</br> Primera letra trasformada a mayuscula: " . primera("karen"); */

        ///////////////////////////////            ///////////////////////////////

        /* function frase_mayus($frase,$conversion=true){

            $frase = strtolower($frase);

            if ($conversion==true) {
                $resultado=ucwords($frase);
            }else {
                $resultado=strtoupper($frase);
            }

            return $resultado;
        }

        echo(frase_mayus("hola mundo"));
        echo(frase_mayus("hola mundo",false)); */


        
        ///////////////////////////////            ///////////////////////////////


        /* function incrementa(&$valor1){
            $valor1++;
            return $valor1;
        }

        $numero=5;

        echo(incrementa($numero) . "</br>");
        echo $numero; */



        ///////////////////////////////            ///////////////////////////////

        function cambia_mayus(&$param){
            $param=strtolower($param);
            $param=ucwords($param);

            return $param;
        }

        $cadena="HoLa MuNdO";

        echo($cadena . "</br>");
        echo (cambia_mayus($cadena) . "</br>");
        echo($cadena . "</br>");
    ?>
</body>
</html>