package App.Arrays;

public class ArrayIntro_1 {
    public static void main(String[] args) {

        int [] myNum = {12,30,40,21,89};
        System.out.println(myNum[0]);         // array index

        for (int i =0; i< myNum.length; i++){ // for loop
            System.out.println(myNum[i]);

        }
        for (int i:myNum) {                  // for each loop
            System.out.println(i);

        }

        }
    }
