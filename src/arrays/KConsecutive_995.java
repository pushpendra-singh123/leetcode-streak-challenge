package arrays;

import java.util.Arrays;

public class KConsecutive_995 {
    public static int minKBitFlips(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                nums[i] = 1;
//                count++;
//            }
//        }
//        return count;

        int[] prefix = new int[nums.length];
        for(int i=0; i<=nums.length-k; i++) {
            int flips = 0;
            if(i>0) flips = prefix[i-1];
            int ef = flips;
            if(i-k>=0) ef -= prefix[i-k];
            if((nums[i]==0&& ef%2==0) || (nums[i]==1 && ef%2==1)) {
                flips+=1;
            }
            prefix[i]=flips;
        }
        for(int i=nums.length-k+1; i<nums.length; i++) {
            int flips = 0;
            if (i > 0) flips = prefix[i - 1];
            int ef = flips;
            if (i - k >= 0) ef -= prefix[i - k];
            if ((nums[i] == 0 && ef % 2 == 0) || (nums[i] == 1 && ef % 2 == 1)) {
                return -1;
            }
            prefix[i] = flips;
        }
    return prefix[nums.length-1];

    }
}
