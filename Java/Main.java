class Main{
    public static void main(String[] args){
        System.out.println("Hello world!");
        // Car car = new Car("TQM123", new Account("Darwin", "1234"));
        // car.printDataCar();

        UberX uberx = new UberX("TQM124", new Account("Pepe", "1234"), "Mazda" ,"PT");
        uberx.setPassenger(2);
        uberx.printDataCar();

        UberVan uberVan = new UberVan("TP123", new Account("Sandra", "1234567"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        //Car car2 = new Car("QM678", new Account("Darwin Q S", "4567"));
        //car2.passenger = 5;   
    }
}