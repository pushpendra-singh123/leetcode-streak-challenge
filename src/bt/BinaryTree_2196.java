package bt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree_2196 {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        // Create all nodes and map parent-child relationships
        for (int[] description : descriptions) {
            int parentVal = description[0];
            int childVal = description[1];
            boolean isLeft = description[2] == 1;

            TreeNode parent = nodes.computeIfAbsent(parentVal, k -> new TreeNode(k));
            TreeNode child = nodes.computeIfAbsent(childVal, k -> new TreeNode(k));

            if (isLeft) {
                parent.left = child;
            } else {
                parent.right = child;
            }

            children.add(childVal);
        }

        // The root will be the node that is not a child of any node
        for (int[] description : descriptions) {
            int parentVal = description[0];
            if (!children.contains(parentVal)) {
                return nodes.get(parentVal);
            }
        }

        return null; // Should never reach here if the input is valid
    }
}
