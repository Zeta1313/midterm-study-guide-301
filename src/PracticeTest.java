import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testSearchNo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "pear");
        String check = Practice.longestWord('z', map);
        assertEquals("", check);
    }
    
    @Test
    void testSearch() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");
        map.put(4, "strawberry");
        map.put(5, "cheeseburger");

        String check = Practice.longestWord('c', map);

        assertEquals("cheeseburger", check);

    }
        @Test
        void testNumSearch() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put( "apple", 1);
        map.put( "banana", 2);
        map.put("cherry", 2);
        map.put("strawberry", 2);
        map.put("cheeseburger", 3);

        int check = Practice.exactLength(1, 7, map);

        assertEquals(3, check);
    }

    @Test
    void testNumSearchEmpty() {
        HashMap<String, Integer> map = new HashMap<>();
        int check = Practice.exactLength(1, 10, map);
        assertEquals(0, check);
    }

        @Test
        void testEO() {
            HashSet<Integer> set = new HashSet<Integer>();
            set.add(1);
            set.add(10);
            set.add(356);
            set.add(7);
            set.add(109);

            int check = Practice.EOdifference(set);
            assertEquals(check, 1);
        }

    @Test
    void testEOAllEven() {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(112);
        set.add(8);
        int check = Practice.EOdifference(set);
        assertEquals(5, check);
    }

        @Test
        void testSecondLargest() {
            ArrayList<Integer> testing = new ArrayList<Integer>();
            testing.add(1);
            testing.add(53);
            testing.add(106);
            testing.add(100009);
            testing.add(2);

            int checking = Practice.secondLargest(testing);
            assertEquals(106, checking);
        }


    @Test
    void testSecondLargestNegatives() {
        ArrayList<Integer> testing = new ArrayList<>();
        testing.add(-10);
        testing.add(-5);
        testing.add(-1);
        testing.add(-7);
        int checking = Practice.secondLargest(testing);
        assertEquals(-5, checking);
    }
}


