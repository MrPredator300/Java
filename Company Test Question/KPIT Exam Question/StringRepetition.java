public class StringRepetition {
        public static void main(String[] args) {
//        String input = "aaabbcddddee";
            String input = "abbbccdeab";
//        String input = "Abaaa";
            String result = removeRepeatingChars(input);
            System.out.println(result);
        }

        public static String removeRepeatingChars(String str) {
            StringBuilder result = new StringBuilder();
            int count = 1;

            for(int i=1;i<str.length();i++) {
                if(str.charAt(i) == str.charAt(i-1)) {
                    count++;
                } else {
                    result.append(str.charAt(i-1));
                    if(count>1) {
                        result.append(str.charAt(i-1));
                    }
                    count =1;
                }

                if(i == str.length()-1) {
                    result.append(str.charAt(i));

                }
                if((count<=3) && (i == str.length()-1)) {
                    result.append(str.charAt(i-1));
                }
            }
            return result.toString();
        }

    }
