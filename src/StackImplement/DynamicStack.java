package StackImplement;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); // it will call custom stack
    }

    public DynamicStack(int size){
        super(size); // it will call custom stack
    }



    public boolean push(int item){
        // this takes care of full
       if(this.isFull()){
           // double the size of the array

           int[] temp = new int[data.length * 2];

           // copy all previous item in new data
           for(int i = 0; i < data.length; i++){
               temp[i] = data[i];
           }
           data = temp;
       }

       // insert item
        // at this point we know that array is not full

        return super.push(item);

    }
}
