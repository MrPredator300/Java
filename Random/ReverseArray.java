import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:-");
        int size = sc.nextInt();
        int[] arr = new int[size];

        CreateArray(arr,size);
        Reverse(arr);
    }

    public static void CreateArray(int[] arr,int size) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements:-");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        System.out.println("The array Elements are:-");
        for(int i=0;i<arr.length;i++)
            System.out.printf(arr[i] + " ");
        System.out.println();
    }

    public static void Reverse(int[] arr) {
        int last2 = arr.length;
        int temp;
        for(int i=0;i<arr.length/2;i++) {
            temp = arr[--last2];
            arr[last2] = arr[i];
            arr[i] = temp;
        }

        System.out.println();
        System.out.println("The array elements after reversing:-");
        for(int i=0;i<arr.length;i++)
            System.out.printf(arr[i] + " ");
    }



}
