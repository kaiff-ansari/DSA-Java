package SubsStringsQuestion;



public class CountSumLength {

    public static void main(String[] args) {

        String[] arr = {"abc", "bcdf","dd", "eefghh"};



        String maximaString = maximum(arr);
        int sum = 0;


        for(int i = 0; i < maximaString.length(); i++){

            Character ch = maximaString.charAt(i);

            if (Character.isDigit(ch)){

                sum += Character.getNumericValue(ch);
            }
        }


        System.out.println(sum);


    }

    static String maximum(String[] arr){

        String max = "";

        for(int i = 0; i < arr.length; i++){

           if (arr[i].length() > max.length()){
               max = arr[i];
           }
        }

        return max;
    }





}
