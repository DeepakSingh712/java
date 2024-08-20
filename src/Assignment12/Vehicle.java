package Assignment12;

public class Vehicle {
        String make;
        String model;
        int year;
        int maximumSpeed;
        public Vehicle(String make, String model, int year, int maximumSpeed) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.maximumSpeed = maximumSpeed;
        }
        public void drive() {
            System.out.println("The vehicle is driving.");
        }
    }
    class Car extends Vehicle {
        public Car(String make, String model, int year, int maximumSpeed) {
            super(make, model, year, maximumSpeed);
        }
        @Override
        public void drive() {
            System.out.println(make + " " + model + " Car is driving.");
        }
    }
    class Bike extends Vehicle {
        public Bike(String make, String model, int year, int maximumSpeed) {
            super(make, model, year, maximumSpeed);
        }
        @Override
        public void drive() {
            System.out.println(make + " " + model + " Bike is driving.");
        }
    }
     class Mainn {
        public static void main(String[] args) {
            Car myCar = new Car("Bugatti", "veyron", 2023, 290);
            Bike myBike = new Bike("Ducati ", "Panigale v-4", 2024, 312);
            System.out.println("Car Details: " + myCar.make + " " + myCar.model + ", Year: " + myCar.year + ", Max Speed: " + myCar.maximumSpeed + " km/h");
            System.out.println("Bike Details: " + myBike.make + " " + myBike.model + ", Year: " + myBike.year + ", Max Speed: " + myBike.maximumSpeed + " km/h");
            myCar.drive();
            myBike.drive();
        }
}
