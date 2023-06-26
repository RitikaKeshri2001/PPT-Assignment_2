import java.util.*;
public class Q5_Max3Product {
    public static int maxProd(int nums[]) {
        Arrays.sort(nums);
        int n = nums.length;
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(maxProd(nums));
    }
}
