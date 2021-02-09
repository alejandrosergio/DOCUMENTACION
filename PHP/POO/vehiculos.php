<?php

        class Coche{
        
            public $ruedas;
            public $color;
            public $motor;
            public $marca;

            function __construct(){

                $this -> ruedas = 4;
                $this -> color  = "Negro";
                $this -> motor  = 3600;
                $this -> marca = "Camaro";

            }

            function acelerar(){

                echo "Estoy arrancando</br>";

            }   
            
            function girar(){

                echo "Estoy girando</br>";

            }

            function frenar(){

                echo "Estoy frenando</br>";

                
            }

            function establece_color($color,$marca){

                $this->color = $color;
                $this->marca= $marca;

                echo "</br>El color de el coche ".$marca." es: " . $color;
            }

        }

        /* INSTANCIAS */
        
        /* 
        $renault = new Coche();
        $mazda = new Coche();
        $ferrari = new Coche();

        $mazda -> girar();
        echo $mazda->ruedas;
        echo $mazda->marca;
        $renault->establece_color("Rojo","renault"); 
        */

        /* Reutilizar Codigo */
        


        ////////////////////////////////// ////////////////////////
        class Camion{
        
            public $ruedas;
            public $color;
            public $motor;
            public $marca;

            function __construct(){

                $this -> ruedas = 8;
                $this -> color  = "Gris";
                $this -> motor  = 2600;
                $this -> marca = "pegaso";

            }

            function acelerar(){

                echo "Estoy arrancando</br>";

            }   
            
            function girar(){

                echo "Estoy girando</br>";

            }

            function frenar(){

                echo "Estoy frenando</br>";

                
            }

            function establece_color($color,$marca){

                $this->color = $color;
                $this->marca= $marca;

                echo "</br>El color de el camion ".$marca." es: " . $color;
            }

        }
    ?>