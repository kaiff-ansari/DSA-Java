package StringWithRecursion;

public class Pc {

    public static void main(String[] args) {
        String str = "mohdkaif8672@gmail.com";
        String name = "";


        for (int i = 0; i < str.length(); i++){
            char ch =str.charAt(i);
            if(ch != '@'){
                name = name+ch;
            }
            else {
                break;
            }

        }

        System.out.println(name);
    }

}
