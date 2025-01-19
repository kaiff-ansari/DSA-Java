package StackImplement;

public class PCCircular {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public PCCircular(){
        this(DEFAULT_SIZE);
    }

    public PCCircular(int size){
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean insert(int item){

        if(isFull()){
            return false;
        }

        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{

        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int delete = data[front++];
       front = front % data.length;
       size--;
       return delete;

    }

    public void display(){

       int i = front;

       do {
           System.out.print(data[i] + "->");
           i++;
           i = i % data.length;
       }while (i != end);
        System.out.println("End");
    }

}
