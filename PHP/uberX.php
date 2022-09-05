<?php

require_once('car.php');

class UberX extends Car{
    public $brand;
    public $model;
    


    public function __construct($license, $driver, $brand, $model) {
        // forma de hacer refencia al constructor del padre

        parent::__construct($license, $driver, $brand, $model);
        $this->brand = $brand;
        $this->model = $model;
    }
}
?>