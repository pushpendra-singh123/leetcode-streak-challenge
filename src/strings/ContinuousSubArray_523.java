package strings;

//Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.
//A good subarray is a subarray where:
//its length is at least two, and
//the sum of the elements of the subarray is a multiple of k.

import java.util.HashMap;

public class ContinuousSubArray_523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for (int i=0;i< nums.length;i++){
            sum+= nums[i];
            if (map.containsKey(sum%k)){
                // check the size
                int index = map.get(sum%k);
                if ((i-index)>=2){
                    return true;
                }
                else{
                    map.put(sum%k, i);//store the first occurrence
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
