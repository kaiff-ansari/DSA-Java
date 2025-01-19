package PracticeRecursion;

import java.util.ArrayList;

public class Seventeen {

    public static void main(String[] args){
      //  DiagonalPath("",3,3);
        System.out.println(Diagonal("",3,3));


    }

    static void DiagonalPath(String p, int r, int c){

        if(r == 1&& c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1 && c > 1){
            DiagonalPath(p+'D',r-1,c-1);
        }

        if(r > 1){
            DiagonalPath(p+'V',r-1,c);
        }

        if(c > 1){
            DiagonalPath(p+'H',r,c-1);
        }
    }

    static ArrayList<String> Diagonal(String p, int r , int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(Diagonal(p+'D',r-1,c-1));
        }

        if(r > 1){
            list.addAll(Diagonal(p+'V',r-1,c));
        }
        if(c > 1){
            list.addAll(Diagonal(p+'H',r,c-1));
        }
        return list;
    }
}
