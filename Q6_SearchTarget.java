public class Q6_SearchTarget {

    public static int search(int[] nums, int target) {
        int first = 0, last = nums.length-1;
        while(first <= last) {
            int mid = first + (last - first)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                last = mid-1;
            } else {
                first = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
