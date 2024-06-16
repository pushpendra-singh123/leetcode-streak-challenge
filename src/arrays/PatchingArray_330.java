package arrays;
// chatGPT solution
public class PatchingArray_330 {
    public int minPatches(int[] nums, int n) {
        int i = 0;
        int totalPatches = 0;
        long sum = 1;

        while (sum <= n) {
            if (i < nums.length && nums[i] <= sum) {
                sum += nums[i++];
            } else {
                sum += sum;
                totalPatches++;
            }
        }

        return totalPatches;
    }
}
