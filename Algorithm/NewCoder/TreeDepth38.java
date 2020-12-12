package newCode;

import Leetcode.linkedList.LinkedList;

import java.util.Queue;

/**
 * @author vanguo996
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，
 * 最长路径的长度为树的深度。
 */


public class TreeDepth38 {

    public static class Solution{

        /**
        * @Description 方法1：递归分治
        *
        */
        public int treeDep(TreeNode root) {
            //从根节点到叶节点的路径, 根据递归遍历修改，计数返回。
            if( root == null ) return 0;
            int valLeft = treeDep(root.left);
            int valRight = treeDep(root.right);
            return max(valLeft, valRight) + 1;
        }

        public int max(int left, int right) {
            return left > right ? left : right;
        }

        /**
        * @Description 方法2：层次遍历
        * 注意边界条件的检查
        */

        public int levelOrder(TreeNode root) {
            if( root == null ) {
                return 0;
            }
            TreeNode curr;
            int depth = 0;
            int size = 1;
            Queue<TreeNode> qu = new java.util.LinkedList<>();
            qu.add(root);
            while( !qu.isEmpty() ) {
                curr = qu.poll();
                System.out.println(curr.value + " ");
                if( curr.left != null ) {
                    qu.add(curr.left);
                }
                if( curr.right != null ) {
                    qu.add(curr.right);
                }
                size--;
                //同一层元素没有退出时，depth不增加
                if( size == 0 ) {
                    depth++;
                    size = qu.size();
                }

            }
            return depth;
        }

        public static void main(String[] args) {
            CreateTree createTree = new CreateTree();
            int[] data = new int[] {1,2,3,4,5,6,7};
            TreeNode treeNode = createTree.create(0, data);

            Solution solution = new Solution();
            int treeDep = solution.treeDep(treeNode);
            System.out.println("层次遍历：");
            int levelOrder = solution.levelOrder(treeNode);
            System.out.println( "层次遍历的深度结果： " +levelOrder);
            System.out.println("分治法的深度结果：" + treeDep);

        }

        //先序遍历，第一次经过该节点打印
        public void travelPre(TreeNode root) {
            if( root == null ) return;
            System.out.print(root.value + " ");
            travelPre(root.left);
            travelPre(root.right);
        }

        public void travelIn(TreeNode root) {
            if( root == null ) return;
            travelIn(root.left);
            System.out.print(root.value + " ");
            travelIn(root.right);
        }

        public void travPrint(Solution solution, TreeNode treeNode) {
            System.out.println("先序遍历：");
            solution.travelPre(treeNode);
            System.out.println("\t中序遍历：");
            solution.travelIn(treeNode);
        }
    }


    /**
    * @Description 建立一棵树
    *
    */
    public static class CreateTree {

        public TreeNode create(int rootNum, int[] data){
            if( rootNum < data.length ) {
                TreeNode node = new TreeNode(data[rootNum]);
                int left = rootNum * 2 + 1;
                if( left < data.length) {
                    node.left = create(left, data);
                }
                if( left + 1 < data.length ) {
                    node.right = create(left + 1,data);
                }
                return node;
            } else {
                return null;
            }
        }

        public static void main(String[] args) {
            CreateTree createTree = new CreateTree();
            int[] data = new int[] {1,2,3,4,5,6,7};
            TreeNode treeNode = createTree.create(0, data);
            System.out.println(treeNode);
        }
//


    }

}
