public class Car {
    private Integer id;
    private String license;
    private Account driver;
    // modificador de accesos:
    // el encapsulamiento significa proteger, ocultar o hacer invisible un elemento
    protected Integer passenger;

    // constructor method
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        // passenger = 4;
        System.out.println();
    }

    void printDataCar(){
        if(passenger != null){
            System.out.println("License: "+ license + " Driver Name: "+ driver.name + " passanger: "+ this.passenger);
        }
        }
       


    // getters and setters
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas registrar 4 passenger");
        } 
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}

