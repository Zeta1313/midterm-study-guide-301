import java.util.HashMap;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }            
        int result = (max - min);
        return result;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String longestWord(char search, HashMap<Integer, String> searched) {
        String result = "";
        for (String current : searched.values()) {
            if (current.charAt(0) == search && current.length() > result.length()) {
                result = current;
            }
        }
        return result;
    }

    public static int exactLength(int x, int y, HashMap<String, Integer> searched) {
        int z = 0;
        for (String current : searched.keySet()) {
            if (current.length() > x && current.length() < y) {
                z++;
            }
        }
        return z;
    }
}