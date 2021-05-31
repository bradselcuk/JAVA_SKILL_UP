package App.Collections;

import java.util.TreeSet;

public class treeSet_ {
    public static void main(String[] args) {

        TreeSet<String> cars = new TreeSet<String>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Dodge");
        cars.add("Ford");
        System.out.println(cars); // printed as array but alphabetic
    }
}
