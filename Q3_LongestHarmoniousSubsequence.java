import java.util.*;
public class Q3_LongestHarmoniousSubsequence {
    public static int longestHarmoniousSubsequence(int[] nums) {

        // create a hashMap to store the numbers from nums
        Map<Long, Integer> map = new HashMap<>();

        // put the value in map
        for (long num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // check the elements whose differences is 1 or not
        int result = 0;
        for (long key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key + 1) + map.get(key));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,2,2,5,2,3,7};
        System.out.println(longestHarmoniousSubsequence(nums));
    }
}
