package App.Collections;

import java.util.TreeMap;

public class treeMap_ {
    public static void main(String[] args) {

        TreeMap<String,String>cars=new TreeMap<>();
        cars.put("Brad","Ford");
        cars.put("Kate","Toyota");
        cars.put("Alice","Mini");
        System.out.println(cars); // printed as array but alphabetical
    }
}
