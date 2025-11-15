
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class AppTest {
    @Test 
    public void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = App.removeDuplicates(list);

        assertTrue(result.isEmpty());
    }

    @Test
    public void testSingleElement() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> result = App.removeDuplicates(list);

        assertEquals(1, result.size());
        assertEquals("A", result.get(0));
    }

    @Test
    public void testNoDuplicates() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> result = App.removeDuplicates(list);

        assertEquals(3, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
    }

    @Test
    public void testWithDuplicatesStrings() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("B");

        ArrayList<String> result = App.removeDuplicates(list);

        assertEquals(2, result.size());
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
    }

    @Test
    public void testWithDuplicatesIntegers() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);

        ArrayList<Integer> result = App.removeDuplicates(list);

        assertEquals(3, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(3));
        assertTrue(result.contains(5));
    }
}
