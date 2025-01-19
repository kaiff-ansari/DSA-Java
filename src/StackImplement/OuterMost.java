package StackImplement;

import java.util.*;
public class OuterMost {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()(()(())"));
    }


    public static String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();


        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){

                if(!stack.isEmpty()){

                    ans.append(ch);

                }
                stack.push(ch);
            }

           else if(ch == ')'){
                stack.pop();
                if(!stack.isEmpty()){
                    ans.append(ch);

                }

            }
        }

        return ans.toString();

    }
}
