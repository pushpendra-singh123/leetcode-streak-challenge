package arrays;

import java.util.Arrays;
import java.util.HashMap;
// Solution by Engineering Digest.

public class CountSubArray_1248 {
    public static int numberOfSubarrays(int[] nums, int k) {
        int res = 0, curr = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int e : nums){
            curr += e%2;
            res += map.getOrDefault(curr -k, 0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;

    }
}
