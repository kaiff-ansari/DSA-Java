package CustomGenricsAndArraylist.com;

import java.util.Arrays;

public class CmGenericsArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CmGenericsArraylist(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
      return size == data.length;

    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for(int i = 0; i < data.length; i++){
            temp[i] = (T)data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public void set(int index, T value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CmGenericsArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CmGenericsArraylist<Integer> list3 = new CmGenericsArraylist<>();
        for(int i = 0; i < 14; i++){
            list3.add(2 * i);
        }
        System.out.println(list3);
    }
}
