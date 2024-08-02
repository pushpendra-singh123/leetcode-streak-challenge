package arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SortFrequencyCount_1636 {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq  = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> PriorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return  (b-a);
            }
            return frea;
        });

    }
}
