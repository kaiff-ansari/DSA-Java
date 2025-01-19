package PracticeRecursion;

public class Fourteen {

    public static void main(String[] args){
        Ascii("","abc");

    }

    static void Ascii(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        Ascii(p+(ch + 0),up.substring(1));
        Ascii(p+ch,up.substring(1));
        Ascii(p,up.substring(1));
    }
}
