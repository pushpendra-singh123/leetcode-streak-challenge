package arrays;

import java.util.Arrays;

public class UniqueArray_945 {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] <= nums[i-1]){
                    nums[i]++;
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7}));
    }
}


//class Solution {
//    public int minIncrementForUnique(int[] nums) {
//        Arrays.sort(nums);
//        int next = 0;
//        int res = 0;
//        for (int num : nums) {
//            if (num < next) {
//                res += next - num;
//            } else {
//                next = num;
//            }
//            next++;
//        }
//        return res;
//    }
//}
