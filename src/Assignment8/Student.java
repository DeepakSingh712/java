package Assignment8;

public class Student {
    //instance variable
    String Name;
    int Age;
    String Department;
    //Default constructor
    Student(){
         Name = "Unknown";
         Age = 20;
         Department = "Unassigned";
    }
    //constructor with name and age
    Student(String name, int age){
         Name = name;
         Age = age;
         Department = "IT";

    }
    //constructor with name, age and department
    Student(String name, int Age, String Department){
        Name = name;
        this.Age = Age;
        this.Department = Department;

    }
    //display method to give the value in the attributes
    void display(){
        System.out.print("Name: " + Name);
        System.out.print(", Age: " + Age);
        System.out.println(", Department: " + Department);
    }

}
class StudentMainClass{
    public static void main(String[] args) {
        //methods to initialize the attributes
        Student s = new Student();
        s.display();
        Student s1 = new Student("Brijesh Baghel", 20);
        s1.display();
        Student s2 = new Student("Deepak Baghel", 20, "IT");
        s2.display();




    }

}
