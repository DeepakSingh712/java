import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;
        int number;

        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);

        scanner.close();
    }

}