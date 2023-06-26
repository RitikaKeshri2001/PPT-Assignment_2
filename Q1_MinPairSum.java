import java.util.*;
public class Q1_MinPairSum {
    public static int arrayPairSum(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        int minSum = 0;

        // find the minimum sum
        for(int i=0; i<nums.length; i += 2) {
            minSum += nums[i];
        }
        return minSum;
    }

    public static void main(String[] args) {
        int nums[] = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}
