package two_pointer;

public class WaterBottles_1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        while (numBottles >= numExchange){
            int exchanged = numBottles / numExchange;
            int extraEmpty = numBottles % numExchange;
            drank += exchanged;
            numBottles = exchanged + extraEmpty;
        }
        return drank;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15, 4));
    }
}
