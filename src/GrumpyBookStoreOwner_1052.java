public class GrumpyBookStoreOwner_1052 {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0, max = 0, sum = 0, gs = 0;
        for (int end=0;end<customers.length;end++){
            if (grumpy[end]!=1){
                sum+=customers[end];
            }else {
                while (end - start+1 >minutes){
                    if (grumpy[start] == 1) gs -= customers[start];
                    start++;
                }
                gs += customers[end];
                max = Math.max(gs,max);
            }
        }
        return sum+max;
    }
}
