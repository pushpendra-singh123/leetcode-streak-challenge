import java.util.ArrayList;
import java.util.List;


//  TreeNode  class is given
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}


public class BalanceBST_1382 {
    private List<TreeNode> list = new ArrayList<TreeNode>();

    public TreeNode balanceBST(TreeNode root) {
        helper(root);
        return construct(0, list.size() - 1);
    }

    private void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        list.add(root);
        helper(root.right);
    }

    private TreeNode construct(int start, int end) { if (start > end) return null;
        int mid = start + (end-start) / 2;
        TreeNode root = list.get(mid);
        root.left = construct(start, mid - 1);
        root.right = construct(mid + 1, end);
        return root;
    }
}
