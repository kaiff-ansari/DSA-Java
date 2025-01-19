package StackImplement;
import java.util.*;
public class RemoveAdjacent {

    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (stack.isEmpty() || stack.peek() != ch){
                stack.push(ch);
            }

            else {
                stack.pop();

            }

        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {

            ans.append(stack.get(i));

        }

        return ans.toString();

    }
}
