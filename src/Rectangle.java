import java.awt.geom.Area;

public class Rectangle {
    int lenght;
    int width;

    Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;

    }

    int Area() {int area = lenght * width;
        return area;


    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Rectangle r1 = new Rectangle(40, 50);


        if(r.Area() >= r1.Area()){
        System.out.println("Rectangle1>Rectangle2");}

        else if (r.Area() < r1.Area()){


        System.out.println("Rectangle2>Rectangle1");}

        else {
        System.out.println("both are equal");}


    }

}