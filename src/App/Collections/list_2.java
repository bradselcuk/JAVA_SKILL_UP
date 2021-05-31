package App.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list_2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(); //List Implementation
        l.add("Sam");  //adding objects to list
        l.add("Sandy");
        l.add("Joe");
        l.add("Arya");
        l.add("Nik");
        System.out.println("List objects are:  " +l); // printing the list

        l.remove("Nik"); //removing objects from list
        System.out.println("After Removing Nik, List Objects are" +l);
        // List Sorted
        List<String> sortedList =l.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}

