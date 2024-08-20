package Assignment9;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//we create a scanner class object
        System.out.print("Enter the number of elements in the array: ");//we take input from user (array size)
        int n = scanner.nextInt();//we assign in integer n variable


        int[] array = new int[n];// array creation
        System.out.println("Enter the elements of the array:");//we take input from user (array value)
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();//type caste and assign array index
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+array[i];
        }
        int average =  sum / n;
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
    }
}
