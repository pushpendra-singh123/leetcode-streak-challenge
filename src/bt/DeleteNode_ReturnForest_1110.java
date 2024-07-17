package bt;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//public class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}

public class DeleteNode_ReturnForest_1110 {
    public TreeNode dfs(TreeNode root, HashSet<Integer> to_delet, List<TreeNode> forest){
        if (root == null){
            return root;
        }
        root.left = dfs(root.left, to_delet, forest);
        root.right = dfs(root.right, to_delet, forest);
        // processing root node
        if (!to_delet.contains(root.val)){
            return root;
        }
        // delete this node
        if (root.left != null){
            forest.add((root.left));
        }
        if (root.right != null){
            forest.add((root.right));
        }
        root.left = null;
        root.right = null;
        return null;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for (int to_be_del : to_delete){
            set.add(to_be_del);
        }
        List<TreeNode> forest = new ArrayList<>();
        root = dfs(root,set, forest);
        if (root != null){
            forest.add(root);
        }
        return forest;
    }
}