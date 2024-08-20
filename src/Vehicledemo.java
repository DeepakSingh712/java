  public interface Vehicledemo {
     abstract void Car();

     class ABC implements Vehicledemo {
         public void Car(){
             System.out.println("Car name is rolls royce phantom");

         }

         public static void main(String[] args) {
             ABC a = new ABC();
             a.Car();

         }
     }
}
