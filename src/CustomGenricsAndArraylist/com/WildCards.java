package CustomGenricsAndArraylist.com;

import java.util.Arrays;

// here T should either be number or its subclass

public class WildCards<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCards(){
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
      return "wildCards{" +
              "data" + Arrays.toString(data) +
              "size" + size +
      '}';
    }

    public static void main(String[] args) {

        WildCards<Number> list4 = new WildCards<>();
        list4.add(422.6);
        list4.add(45);

    }
}
