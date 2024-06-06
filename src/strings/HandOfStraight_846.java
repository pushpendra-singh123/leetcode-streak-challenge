package strings;

import java.util.PriorityQueue;

public class HandOfStraight_846 {
    public static boolean isNStraightHand(int[] hand, int gs) {
        if (hand.length % gs != 0) return false;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val: hand){
            pq.add(val);
        }
        while (!pq.isEmpty()){
            int smallest = pq.poll();
            for (int i = 1; i < gs; i++) {
                if (pq.remove(smallest + i)){
                    continue;
                }else return false;
            }
        }
        return true;
    }

}
