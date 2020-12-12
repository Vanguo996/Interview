package practice.tree;

/**
 * @author vanguo996
 */


public class LeetCode111 {
    //二叉树的最小深度

    //二叉树的最大深度
    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;

    }
//
//    public static int minDepth(practice.tree.TreeNode root){
//        if(root == null) return 0;
//
//        int left = minDepth(root.left);
//        int right = minDepth(root.right);
//
//        return Math.min(left, right) + 1;
//    }

    //在这种情况下[1,2] 最小深度为2？
    //答：最小深度定义为到最近叶子节点的深度，因为根节点有子节点所以根节点不是叶子节点。
    //只有在根节点左右孩子都没有的情况下，树的高度才为1
    //所以最近叶子节点的深度是 【节点2】 的当前深度，为2
//    public static int minDepth(practice.tree.TreeNode root){
//        if(root == null) return 0;
//
//        if(root.left == null && root.right == null) return 1;
//
//
//    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.left = n5;


//        System.out.println(minDepth(n1));
    }


}
