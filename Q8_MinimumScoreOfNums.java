public class Q8_MinimumScoreOfNums {
    public static int minScore(int[] nums, int k) {

        // initialize the minimum element and maximum element
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        int temp = max - min - 2 * k;
        if(temp < 0){
            return 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int nums[] = {1};
        int k = 0;
        System.out.println(minScore(nums, k));
    }
}
