package StackImplement;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){

        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws StackException{

        if(isEmpty()){
            throw new StackException("Cannot pop from the stack");
        }

//        int removed = data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--]; // from above or this
    }



    public boolean isFull() {

        return ptr == data.length-1; // ptr at last index
    }

    private boolean isEmpty() {
        return ptr == -1; // ptr at -1
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from the stack");
        }
        return data[ptr];
    }

    public void display(){
        for (int i = 0; i < ptr; i++){
            System.out.print(data[i] + " ");
        }

        System.out.println("End");
    }

}
