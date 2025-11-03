import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
    

    // TODO: Make tests for each problem you solve
    
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
        void testEO() {
            HashSet<Integer> set = new HashSet<Integer>();
            set.add(1);
            set.add(10);
            set.add(356);
            set.add(7);
            set.add(109);
        }
}


