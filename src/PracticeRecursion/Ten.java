package PracticeRecursion;

public class Ten {

    public static void main(String[] args) {
        RemoveCharacter("","baccad");

    }

    static void RemoveCharacter(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            RemoveCharacter(p,up.substring(1));
        }
       else {
           RemoveCharacter(p+ch,up.substring(1));
        }
    }
}
