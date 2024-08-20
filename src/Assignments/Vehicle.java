package Assignments;

public class Vehicle {

    void start() {
        System.out.println("vehicle started");
    }

    public static void main(String[] args) {
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        Garage g = new Garage();
        g.serviceVehicle(c);
        g.serviceVehicle(m);
    }

}

 class Car extends Vehicle {
    void start(){

        System.out.println("car started");
    }
}

 class Motorcycle extends Vehicle {
    void start(){

        System.out.println("motorcycle started");
    }
}

class Garage {

    void serviceVehicle(Vehicle vehicleobj){
        vehicleobj.start();
        System.out.println("vehicle serviced");
    }
}

