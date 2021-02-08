<?php

        class Coche{
        
            protected $ruedas;
            protected $color;
            protected $motor;

            function __construct(){

                $this -> ruedas = 4;
                $this -> color  = "";
                $this -> motor  = 1600;

            }

            function get_ruedas(){
                return $this->ruedas;
            }

            function get_color(){
                return $this->color;
            }

            function get_motor(){
                return $this->motor;
            }


            function arrancar(){

                echo "Estoy arrancando</br>";

            }   
            
            function girar(){

                echo "Estoy girando</br>";

            }

            function frenar(){

                echo "Estoy frenando</br>";

                
            }

            function set_color($color_coche,$nombre_coche){

                $this->color = $color_coche;

                echo "</br>El color de el coche ".$nombre_coche." es: " . $color_coche;
            }

        }

        class Camion extends Coche{
        
            public $ruedas;
            public $color;
            public $motor;
            public $marca;

            function __construct(){

                $this -> ruedas = 8;
                $this -> color  = "Gris";
                $this -> motor  = 2600;
            }

            function set_color($color_camion,$nombre_camion){

                $this->color = $color_camion;

                echo "</br>El color de el camion ".$nombre_camion." es: " . $color_camion;
            }

            function arrancar(){

                parent::arrancar();

                echo "camion arrancado";
            }

        }
    ?>