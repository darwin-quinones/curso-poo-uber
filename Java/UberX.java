class UberX  extends Car{
    // declarar variables
    String brand;
    String model;

    // metodo constructor
    public UberX(String license, Account driver, String brand, String model){
        super(license, driver); // referencia a la super clase
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Model: "+ model + " Brand: "+ brand);
    }
}
