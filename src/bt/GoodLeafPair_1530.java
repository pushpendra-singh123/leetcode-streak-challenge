package bt;

public class GoodLeafPair_1530 {
    int res = 0;
    public int[] dfs(TreeNode root,int dist){
        int leafDist[] = new int[11];
        if (root == null){
            return leafDist;
        } else if (root.left == null && root.right == null) {
            leafDist[1] = 1;
            return leafDist;
        }
        int leftLeafDist[] = dfs(root.left, dist);
        int rightLeafDist[] = dfs(root.right, dist);
//        for (int d1 = 1 ; d1 < 11; d1++) {
//            for (int d2 = 1; d2 < 11; d2++) {

        for (int d1 = 1 ; d1 <= dist; d1++) {
            for (int d2 = 1; d2 <= dist; d2++) {
                if (d1+d2 <= dist){
                    res += leftLeafDist[d1]*rightLeafDist[d2];
                }
            }
        }
        for (int d = 1; d < 11; d++) {
            leafDist[d] = leftLeafDist[d-1] + rightLeafDist[d-1];
        }
        return leafDist;
    }
    public int countPairs(TreeNode root, int distance) {
        dfs(root,distance);
        return res;
    }
}


