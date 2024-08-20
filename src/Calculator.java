public class Calculator {
    //Method overloading
   int add(int num1, int num2){
       return num1 + num2;
    }
   int add (int num1, int num2 , int num3 ){
       return num1+num2+num3;
   }
   double add(double num1,double num2){
       return num1+num2;

   }

    public static void main(String[] args) {
    Calculator obj = new Calculator();
    //obj.add(10,20);
        //return sum of int args
        System.out.println("sum of two int args: " +obj.add(10,20));
        System.out.println("sum of three int args: " +obj.add(20,20,20));
        System.out.println("sum of two double args: " +obj.add(20.2,20.9));
    }

}
