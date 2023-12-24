public class Anandh_Test
{
    public static void FindMe(int input1)
    {
        try {
            int testnum = input1;
            while(testnum<=1000)
            {
                int tempnum = testnum;
                int sum=0;
                while(tempnum>0)
                {
                    sum+=(tempnum%10);
                    tempnum = (int)(tempnum/10);
                }
                if((sum==input1) && (sum!=testnum))
                {
                    System.out.println("Your answer is:"+ testnum+" "+sum+" "+tempnum);
                    break;
                }

                testnum = testnum + input1;
            }
            System.out.println("Inside fun2(). " + input1);
            throw new IllegalAccessException("demo");
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
        System.out.println("Inside fun(). ");
    }
    public static void main(String[] args) {

        FindMe(10);

        System.out.println("Hello World");
    }
}
