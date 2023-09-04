//1. How do you reverse a string in Java?
public class StringRev {
    public static void main(String[] args) {
        String str = "Sanjay";
        System.out.println(str);
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        StringBuilder tempStr = new StringBuilder();
        char[] chars = str.toCharArray();           //Converting String into characters
        for(int i=str.length()-1;i>=0;i--) {
//            System.out.println(chars[i]);
            tempStr.append(chars[i]);
            //for(int i=0;i>tempStr.length();i++)
        }
        return tempStr.toString();                  //we have to convert Stringbuilder to String
    }


}
