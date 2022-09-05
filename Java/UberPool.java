class UberPool extends Car {
    String brand;
    String model;


    // constructor parameters
    public UberPool(String license, Account driver, String brand, String model){
        // definiendo elementos requeridos
        super(license, driver);
        this.model = model;
        this.brand = brand;
    }
}
