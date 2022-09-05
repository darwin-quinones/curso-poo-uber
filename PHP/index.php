<?php

// clase de polimorfismo: esto significa diferentes formas  
//(si se comporta de diferentes maneras y otorga diferentes resultados)
// abstract class Base{
//     protected $name;

//     private function getClassName(){
//         return get_called_class();
//     }

//     public function login(){
//         return "Mi nombre es $this->name desde la clase {$this->getClassName()}";
//     }


// }

// class Admin extends Base{
//     public function __construct($name){
//         $this->name = $name;
//     }
// }

// class User extends Base {
//     public function __construct($name){
//         $this->name = $name;
//     }
// }

// class Guest extends Base{
//     protected $name = "Invitado";
// }

// // instancias
// $guest = new Guest();
// echo $guest->login();

// $admin = new Admin("Darwin");
// echo $admin->login();

// $user = new User("Pepe");
// echo $user->login();

require_once("car.php");
require_once("account.php");
require_once('uberX.php');
require_once('uberPool.php');


// $car = new Car("AMD123", new Account("Pepito", "12345678"));

$uberX = new UberX("APT2", new Account("Pepe R", "123456"), "Ferrari", "AZ");
$uberX->printDataCar();

$uberPool = new UberPool("APT3", new Account("Maria", "100453"), "Chevrolet", "spark");

$uberPool->printDataCar();


?>

<!-- <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Object Oriented Programming in PHP</h1>
    <H5>By Darwin</H5>
    <p style="color:red; font: size 12px;">
      
        
    </p>
    
</body>
</html> -->
