import java.util.Scanner;

public class ArrayDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array:-");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the Array Elements:-");
        for(int i=0;i<size;i++)
           arr[i] = sc.nextInt();

        System.out.println("The array Elements are:-");
        for(int i=0;i<size;i++)
            System.out.printf(arr[i] + " ");
    }


}
