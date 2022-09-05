<?php
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "Licencia: $this->license \n Nombre del conductor: {$this->driver->name} \n Documento: {$this->driver->document} ";
    }

}