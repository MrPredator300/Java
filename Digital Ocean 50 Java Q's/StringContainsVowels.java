//3. Write a Java program to check if a vowel is present in a string.
public class StringContainsVowels {
    public static void main(String[] args) {
        String str = "tmmy";
        checkVowels(str);
    }

    //Method-1
    public static void checkVowels(String str) {
        char[] chars = str.toCharArray();
        for(int i=0;i<=str.length()-1;i++) {
            if(chars[i] == 'A' || chars[i] == 'a' || chars[i] == 'E' || chars[i]=='e' || chars[i]=='I' || chars[i]=='i'
            || chars[i] == 'O' || chars[i] == 'o' || chars[i] == 'U' || chars[i] == 'u')
            {
                System.out.println("The String contains a vowel");
                break;
            } else {
                if(i==str.length()-1)
                System.out.println("The String does not contains a vowel");
            }
        }
    }

    //Method-2
    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

}
