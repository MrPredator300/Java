//2. How do you swap two numbers without using a third variable in Java?
public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1=" + num1 + " " + "num2=" + num2);
        System.out.println("After Swapping the numbers:-");
        swapNumbers(num1,num2);
    }

    public static void swapNumbers(int num1,int num2) {
        int temp;
        temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("num1=" + num1 + " " + "num2=" + num2);
    }

}
