package arrays;

public class AverageWatingTime_1701 {
    public double averageWaitingTime(int[][] customers) {
        int idleTime = 1;
        long totalWaitingTime = 0;
        for (int customer[]:customers){
            // when chef is free.
            if (idleTime <= customer[0]){
                idleTime = customer[0] + customer[1];
            }
            else {
                idleTime += customer[1];
            }
            totalWaitingTime += (idleTime - customer[0]);
        }
        double avg = totalWaitingTime / (double)customers.length;
        return avg;
    }
}
