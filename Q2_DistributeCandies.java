import java.util.*;
public class Q2_DistributeCandies {

    public static int distributeCandies(int candyType[]) {
        Set<Integer> candySet = new HashSet<>();
        int halfLength = candyType.length/2;

        // use for each loop to iterate the candyType array
        for(int c: candyType) {
            if(candySet.size() >= candyType.length) {
                return halfLength;
            }
            candySet.add(c);
        }
        return Math.min(candySet.size(), halfLength);
    }

    public static void main(String[] args) {
        int candyType[] = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}
