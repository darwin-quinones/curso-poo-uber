class Main{
    public static void main(String[] args){
        System.out.println("Hello world!");
        Car car = new Car("TQM123", new Account("Darwin", "1234"));
        car.passenger = 4;
        car.printDataCar();


        Car car2 = new Car("QM678", new Account("Darwin Q S", "4567"));
        car2.passenger = 5;
        car.printDataCar();
    }
}