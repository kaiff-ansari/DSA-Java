package PracticeRecursion;

import java.util.ArrayList;

public class Fifteen {

    public static void main(String[] args){
       // Path("",3,3);
        //System.out.println(Pathret("",3,3));
        System.out.println(count(3,3));


    }

    static void Path(String p, int r, int c){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            Path(p+'D',r-1,c);
        }

        if(c > 1){
            Path(p+'R',r,c-1);
        }

    }

    static ArrayList<String> Pathret(String p, int r, int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(Pathret(p+'R',r-1,c));
        }

        if(c>1){
            list.addAll(Pathret(p+'D',r,c-1));
        }
        return list;
    }

    static int count(int r , int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;

    }
}
