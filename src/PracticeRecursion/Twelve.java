package PracticeRecursion;


import StringWithRecursion.SubSeq;

import java.util.ArrayList;
import java.util.List;

public class Twelve {

    public static void main(String[] args) {
        System.out.println( Subseq1("","abc"));

    }

    static void SubSeq(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        SubSeq(p+ch,up.substring(1));
        SubSeq(p,up.substring(1));
    }

    static int countSubseq(String p, String up){

        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        count = count + countSubseq(p+ch,up.substring(1));
       count = count +  countSubseq(p,up.substring(1));
       return count;
    }


    static ArrayList<String> Subseq1(String p, String up){

        if(up.isEmpty()){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = Subseq1(p+ch,up.substring(1));
        ArrayList<String> right = Subseq1(p,up.substring(1));
        left.addAll(right);
        return left;

    }
}
