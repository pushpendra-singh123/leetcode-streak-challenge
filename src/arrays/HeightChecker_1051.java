package arrays;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] arr = Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]){
             count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,5,7,9,8};
        System.out.println(heightChecker(arr));

    }
}
