class Main{
    public static void main(String[] args){
        System.out.println("Hello world!");
        Car car = new Car();
        car.license = "TQM123";
        car.driver = "Darwin";
        car.passenger = 4;
        car.printDataCar();


        Car car2 = new Car();
        car2.license = "TQM678";
        car2.driver = "Pepito";
        car2.passenger = 5;
        car.printDataCar();
    }
}