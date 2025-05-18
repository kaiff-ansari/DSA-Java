package hashmapPc;

public class StringFrequenct {

    public static void main(String[] args) {

        String s = "abcadcdba";

        int hash[] = new int[26];

        for (int i = 0; i < s.length(); i++){

            hash[s.charAt(i) - 'a']++;

        }

        for (int i = 0; i < hash.length; i++){

            if (hash[i] > 0){

                System.out.println((char)(i+'a') + ": " + hash[i]);
            }
        }
    }
}
