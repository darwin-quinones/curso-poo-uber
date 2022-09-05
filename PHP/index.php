<?php

// clase de polimorfismo: esto significa diferentes formas  
//(si se comporta de diferentes maneras y otorga diferentes resultados)
abstract class Base{
    protected $name;

    private function getClassName(){
        return get_called_class();
    }

    public function login(){
        return "Mi nombre es $this->name desde la clase {$this->getClassName()}";
    }


}

class Admin extends Base{
    public function __construct($name){
        $this->name = $name;
    }
}

class User extends Base {
    public function __construct($name){
        $this->name = $name;
    }
}

class Guest extends Base{
    protected $name = "Invitado";
}

// instancias
$guest = new Guest();
echo $guest->login();

$admin = new Admin("Darwin");
echo $admin->login();

$user = new User("Pepe");
echo $user->login();





