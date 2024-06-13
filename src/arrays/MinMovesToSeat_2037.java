package arrays;

import java.util.Arrays;

public class MinMovesToSeat_2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            moves += (seats[i] - students[i]);
        }
        return moves;

    }
}
