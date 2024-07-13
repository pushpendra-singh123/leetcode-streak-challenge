import java.util.*;

public class RobotCollisions_2751 {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        // Sort the indexes based on the positions
        Arrays.sort(indexes, Comparator.comparingInt(a -> positions[a]));

        Stack<Integer> stack = new Stack<>();

        // Process each robot by their sorted position
        for (int index : indexes) {
            if (directions.charAt(index) == 'R') {
                stack.push(index);
            } else {
                while (!stack.isEmpty() && directions.charAt(stack.peek()) == 'R') {
                    int topIndex = stack.peek();
                    if (healths[topIndex] > healths[index]) {
                        healths[topIndex]--;
                        healths[index] = 0;
                        break;
                    } else if (healths[topIndex] < healths[index]) {
                        healths[index]--;
                        healths[topIndex] = 0;
                        stack.pop();
                    } else {
                        healths[index] = 0;
                        healths[topIndex] = 0;
                        stack.pop();
                        break;
                    }
                }
                if (healths[index] > 0) {
                    stack.push(index);
                }
            }
        }

        // Collect the remaining healths of robots in the original order
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (healths[i] > 0) {
                res.add(healths[i]);
            }
        }
        return res;
    }
}
