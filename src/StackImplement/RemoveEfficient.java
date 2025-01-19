package StackImplement;

import java.util.Stack;

public class RemoveEfficient {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public RemoveEfficient(){
        first = new Stack<>();
        second = new Stack<>();

    }

    public void add(int x){
      while (!first.isEmpty()){
          second.push(first.pop());
      }

      first.push(x);
      while (!second.isEmpty()){
          first.push(second.pop());
      }
    }

    public int pop() throws Exception{

        return first.pop();


    }

    public int peek() throws Exception{

        return first.peek();

    }

    public boolean empty() {
        return first.isEmpty();

    }

}
