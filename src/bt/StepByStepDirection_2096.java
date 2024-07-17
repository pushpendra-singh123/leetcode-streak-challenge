package bt;
//
public class StepByStepDirection_2096 {

    /* code by shash not working */
//    public boolean findPath(TreeNode root,int target, StringBuilder path) {
//        if (root == null) {
//            return false;
//        }
//        if (root.val == target) {
//            return true;
//        }
//        path.append("L");
//        if (findPath(root.left, target, path)) {
//            return true;
//        }
//        //  Backtracking
//        path.setLength(path.length() - 1);
//
//        path.append("R");
//        if (findPath(root.right, target, path)) {
//            return true;
//        }
//        path.setLength(path.length()-1);
//        return false;
//    }
//    public String getDirections(TreeNode root,int startValue, int destValue){
////        TreeNode lca = LCA(root,startValue,endValue);
//        StringBuilder sourceToLCA = new StringBuilder();
//        StringBuilder LCAToDest = new StringBuilder();
//        findPath(root, startValue, sourceToLCA);
//        findPath(root, destValue, LCAToDest);
//        int p1 = 0,p2 = 0;
//        while (p1<sourceToLCA.length() && p2<LCAToDest.length()){
//            if (sourceToLCA.charAt(p1) == LCAToDest.length()){
//                p1++;
//                p2++;
//            }else {
//                break;
//            }
//        }
//        StringBuilder res = new StringBuilder();
//        for (int i = p1; i < sourceToLCA.length(); i++) {
//            res.append("U");
//        }
//        for (int i = p2; i < LCAToDest.length(); i++) {
//            res.append(LCAToDest.charAt(i));
//        }
//
//        return res.toString();
//
//    }

    /* coding for dummies */
}