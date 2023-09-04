//4. Write a Java program to check if the given number is a prime number.

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int userinput = sc.nextInt();
        System.out.println(CheckPrime(userinput));
    }

    public static boolean CheckPrime(int num) {
        if(num==0 || num==1)
            return false;
        if(num==2)
            return true;
        for(int i=2;i<num;i++) {
            if(num%i==0) {
                return false;
            } else
            if(i==num-1)
                return true;
        }
        return false;
    }

}
