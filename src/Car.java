public class Car {
    String name;
    String model;
    short year;
    int price;
    Car(String me, String md, int pr, short yr ){//methods
        name = me;
        model = md;
        year = yr;
        price = pr;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);

    }

    public static void main(String[] args) {
        Car c = new Car("BMW","M5",1250000000, (short) 2024);
        c.display();
    }

}
