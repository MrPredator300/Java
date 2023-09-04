//5. Write a Java program to print a Fibonacci sequence using recursion.

import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size: ");
        int userInput = sc.nextInt();
        PrintFibonacci(userInput);
//        printFibonacciSequence(userInput);
    }

    public static void PrintFibonacci(int size) {               //Method-1
        int num1=0,num2=1;
        int sum=0,sum2=1;
        System.out.printf(num1 + " " + num2 + " ");
        for(int i=2;i<size;i++) {
            sum=num1+num2;
            sum2=sum2+sum;
            System.out.printf(sum + " ");
            num1 = num2;
            num2 = sum;
        }
        System.out.println();
        System.out.println("Result ="+ sum2);
        }

    public static void printFibonacciSequence(int count) {          //Method-2
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }

    public static int PrintFibonacciRecursive(int count) {                    //Method-3
        if (count <= 1)
            return count;

        return PrintFibonacciRecursive(count - 1) + PrintFibonacciRecursive(count - 2);
    }

                                                                            //Method-3 main function()
//    public static void main(String args[]) {
//        int seqLength = 10;
//
//        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
//
//        for (int i = 0; i < seqLength; i++) {
//            System.out.print(PrintFibonacciRecursive(i) + " ");
//        }
//    }

}
