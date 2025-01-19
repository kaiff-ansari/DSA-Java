package CustomGenricsAndArraylist.com;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public  int remove(){
       int removed = data[--size];
       return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void Set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){
   CustomArraylist list = new CustomArraylist();
//        list.add(45);
//        list.add(46);
//
//        System.out.println(list);


        for(int i = 0; i < 14; i++){
            list.add(2 * i);
        }
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();
        // in array list <Integer> deline this is only add and removed
        // Intger value it increase type safety  it is knowns ad genrics

        list2.add(42);


    }
}
