package PracticeRecursion;

public class One {

    public static void main(String[] args) {
        String up = "geeksforGeeks";
        findUppercase("",up);

    }


static void findUppercase( String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(Character.isUpperCase(ch)){
            findUppercase(p+ch,up.substring(1));

        }
    findUppercase(p,up.substring(1));
}





}
