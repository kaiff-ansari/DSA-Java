package stackPractices;



public class customStack {

    int[] data;
    int size = 0;

    private final int DEFAULT_SIZE = 10;



    int ptr = -1;
    public customStack() {
        this.data = new int[DEFAULT_SIZE];
    }
    public customStack(int[] data, int size) {
        this.data = data;
        this.size = data.length;
    }

    public boolean isFull(){

        return data.length == size;


    }

    public boolean isEmpty(){
        return size == 0;
    }


    public boolean push(int item){

        if (isFull()){
            System.out.println("stack is overflow");
            return false;
        }

        ptr++;
        data[ptr] = item;
        size++;
        return true;

    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i <= ptr; i++) {
            System.out.println(data[i]);
        }
    }

    public int pop(){

        if (isEmpty()){
            System.out.println("stack is empty");
        }

       int remove =  data[ptr--];
        size--;
        return remove;

    }






}
