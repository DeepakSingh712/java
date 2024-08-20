import java.util.Scanner;

public class ArmstrongNumber {

        public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        printArmstrongNumbers(start, end);

        sc.close();
    }

        // Method to check if a number is Armstrong or not
        public static boolean isArmstrong ( int number){
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // Count number of digits
        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            ++n;
        }

        originalNumber = number;

        // Calculate Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            int cube = 1;
            for (int i = 0; i < n; i++) {
                cube *= remainder;
            }
            result += cube;
            originalNumber /= 10;
        }

        if (result == number)
            return true;

        return false;
    }

        // Method to print Armstrong numbers in a given range
        public static void printArmstrongNumbers ( int start, int end){
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    }

