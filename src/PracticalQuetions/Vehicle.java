package PracticalQuetions;

/*● Write a Java program to create a class called Vehicle with a method called
drive().
● Vehicle should have attributes such as make (String), model (String) ,
year (int) and maximumSpeed (int).
● Create a constructor in Vehicle with all fields as constructor parameters.
● Create a subclass called Car and override constructor. Call super(). ●
Write a function that overrides the drive() method to print (make + “ ” +
model + " Car is driving".)
● Also create another subclass Bike extending the vehicle class. ●
Override the drive() method to print (make + “ ” + model + " Bike is
driving".)
● Instantiate both Bike and Car class. Print their attributes*/

public class Vehicle {
    String Make;
    String Model;
    int Year;
    int MaximumSpeed;
     void Drive(){
     }
    Vehicle(String Make, String Model, int Year, int MaximumSpeed){
         this.Make = Make;
         this.Model = Model;
         this.Year = Year;
         this.MaximumSpeed = MaximumSpeed;

    }
}
class Car extends Vehicle{
    void Drive(){
        System.out.println(Make +" " + Model + " " + Year + " " + "Car is driving");
    }
    //WE CAN'T OVERRIDE CONSTRUCTOR
    Car(String Make, String Model, int Year, int MaximumSpeed) {
        super("ford", "vintage", 1967, 256);
    }
}
class Bike extends Vehicle{
    @Override
    void Drive() {
        System.out.println(Make +" " + Model + " " + Year + " " + "Bike is driving");

    }
    Bike(String Make, String Model, int Year, int MaximumSpeed) {
        super(Make, Model, Year, MaximumSpeed);
    }

    Car c = new Car("ford", "vintage", 1967, 256);
    Bike B = new Bike("ford", "vintage", 1967, 256);

}
