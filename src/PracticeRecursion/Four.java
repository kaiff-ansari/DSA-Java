package PracticeRecursion;

public class Four {

    public static void main(String[] args) {
        System.out.println(findLength("kaif"));

    }

    static int findLength(String up){

        if(up.isEmpty()){
            return 0;
        }

        int count = 1;
        char ch = up.charAt(0);

        count = count + findLength(up.substring(1));
        return count;


    }
}
