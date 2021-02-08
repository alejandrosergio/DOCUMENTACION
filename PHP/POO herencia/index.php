<?php

    class Abuelo{

        public $reloj;
        public $binoculo;
        public $baston;

        function __construct()
        {
            $this -> reloj = "canon";
            $this -> binoculo = "marks";
            $this -> baston = 1;
        }

        function leer($sujeto){

            echo "El ".$sujeto." aprendio a leer la hora </br>";

        }
        
        
    }

    $abuelo = new Abuelo();
    echo "<h1>ABUELO</h1></br>";

    echo "La marca del reloj es: ".$abuelo->reloj . "</br>";
    $abuelo->leer("abuelo");


    class Padre extends Abuelo{

        public $coche;
        public $movil;

        function __construct()
        {
            $this -> coche = "Mazda";
            $this -> movil = "Iphone";
            $this -> reloj = "canon";
            $this -> binoculo = "marks";
        }

        function manejar($sujeto){

            echo "El ".$sujeto." aprendio a manejar el coche </br>";

        }
    }

    $padre = new Padre();
    echo "<h1>PADRE</h1></br>";

    echo "La marca del reloj es: ".$padre->reloj . "</br>";
    echo "La marca del binoculo es: ". $padre->binoculo . "</br>";
    $padre->leer("padre");
    $padre->manejar("padre");
    echo "la marca del movil es: ".$padre->movil . "</br>";



    class Hijo extends Padre{

        public $tetero;
        public $mesedora;
        

        function __construct()
        {
            $this -> coche = "Mazda";
            $this -> movil = "Iphone";
            $this -> reloj = "canon";
            $this -> binoculo = "marks";
            $this -> tetero = "marvel";
            $this -> mesedora = "pleydou";
        }

        function accion($sujeto){

            echo "El ".$sujeto." aprendio a masearce en la mesedora </br>";

        }

        function manejar($sujeto){

            parent::manejar($sujeto); 

            echo "El hijo aun es muy peuqueño </br>";
        }

    }

    $hijo = new Hijo();
    echo "<h1>HIJO</h1></br>";

    echo "La marca del reloj es: ".$hijo->reloj . "</br>";
    echo "La marca del binoculo es: ". $hijo->binoculo . "</br>";
    $hijo->leer("hijo");
    $hijo->manejar("hijo");
    echo "la marca del movil es: ". $hijo->movil . "</br>";
    $hijo->accion("hijo");

?>