
package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new HashSet<>();

        for (T item : list) {
            set.add(item);
        }

        ArrayList<T> result = new ArrayList<>(set);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);

        ArrayList<Integer> noDuplicates = removeDuplicates(numbers);
        System.out.println(noDuplicates);
    }
}
