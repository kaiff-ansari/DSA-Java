package centelliInterview;

public class question2 {

    public static void main(String[] args) {

        String str = "abcei";

        int countConstant = 0;
        int countVowel = 0;

        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                countVowel++;
            } else {
                countConstant++;
            }
        }

        String upper = str.toUpperCase();

        System.out.println("uppercase  " + upper);
        System.out.println("count constant  " + countConstant);
        System.out.println("count vowel " + countVowel);
    }
}