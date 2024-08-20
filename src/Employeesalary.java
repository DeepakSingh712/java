import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Employeesalary {
    double basicSalary;
    double grossSalary;
    double HRA;
    double DA;

    static Scanner sc = new Scanner(System.in);
    static int no;
   double calculateGrossSalary(double basicSalary){

        if(basicSalary>15000){
             HRA= 0.2*basicSalary;
             DA= 0.6*basicSalary;
            grossSalary = basicSalary+HRA+DA;


        } else {
            HRA=3000;
            DA=0.7*basicSalary;
            grossSalary=basicSalary+DA+HRA;
        }

        return grossSalary;


    }

    public void input()
    {

        System.out.println("enter basic salary: ");
        double basicSalary = sc.nextDouble();
        Employeesalary emp = new Employeesalary();
        System.out.println(emp.calculateGrossSalary(basicSalary));
    }

    public static void main(String[] args) {

       Employeesalary emp = new Employeesalary();
       emp.input();

        System.out.print("Enter a no here : ");
         no = sc.nextInt();

        while(no==-1){
            emp.input();

            System.out.print("Enter a no here : ");
            no = sc.nextInt();
        }
    }
}