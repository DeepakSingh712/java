package Assignment12;

public class Shape {
        public double getArea() {
            return 0;
        }
    }
    class Circle extends Shape {
        private int radius;
        public Circle(int radius) {
            this.radius = radius;
        }
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
    class Square extends Shape {
        private int length;
        public Square(int length) {
            this.length = length;
        }
        @Override
        public double getArea() {
            return length * length;
        }
    }
    class Rectangle extends Shape {
        private int width;
        private int height;
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public double getArea() {
            return width * height;
        }
    }
     class Maain {
        public static void main(String[] args) {
            Shape circle = new Circle(5);
            Shape square = new Square(4);
            Shape rectangle = new Rectangle(3, 6);
            System.out.println("Area of Circle: " + circle.getArea());
            System.out.println("Area of Square: " + square.getArea());
            System.out.println("Area of Rectangle: " + rectangle.getArea());
        }
}
