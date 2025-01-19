package PracticeRecursion;

public class Eleven {

    public static void main(String[] args){
        System.out.println(skip("","huehueapplestuff"));


    }

    static String skip(String p, String up){

        if(up.isEmpty()){

            return "";
        }



        if(up.startsWith("apple")){
           return skip(p,up.substring(5));
        }
        else {
           return  up.charAt(0) + skip(p,up.substring(1));
        }
    }
}
