package App.Loops;

public class allLoops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // foreach loop
        String[] name = {"Cafer", "Meltem", "Doga"}; // array
        for (String i : name) {
            System.out.println(i);
        }
        // while
        int i = 0;
        while (i <= 10) {
            System.out.println(i++);
        }
        //do while

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 9);

    }
}
