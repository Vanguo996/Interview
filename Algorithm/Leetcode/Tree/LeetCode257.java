package practice.tree;

/**
 * @author vanguo996
 */
import practice.tree.TreeNode;

import java.util.*;

public class LeetCode257 {



    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        rec(root, "", list);
        return list;

    }

    public static void rec(TreeNode root, String path, List<String> list){

        if(root !=null){
            //这里加入的时候需要把数组转换成字符串，
            StringBuilder sb = new StringBuilder(path + root.val);
            //当前是叶子节点
            if(root.left == null && root.right == null){
                list.add(sb.toString());

            } else {

                sb.append("->");
                rec(root.left, sb.toString(), list);
                rec(root.right, sb.toString(), list);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1).left = new TreeNode(3).left
                = new TreeNode(5);
        node.right = new TreeNode(2).right = new TreeNode(4);



        System.out.println(Print(node));


    }

    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        //result用来存储结果
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null)
            return result;
        //line存取每一行数字
        ArrayList<Integer> line = new ArrayList<Integer>();
        //建立两个堆栈
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        boolean flag = true;
        TreeNode node;
        stack1.push(pRoot);

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            //如果奇数行，正序打印
            if (flag) {
                while (!stack1.isEmpty()) {
                    node = stack1.pop();
                    line.add(node.val);
                    //先存left子节点，再存right子节点
                    if (node.left != null) {
                        stack2.push(node.left);
                    }
                    if (node.right != null) {
                        stack2.push(node.right);
                    }
                    //当堆栈为空，说明该行节点遍历完毕
                    if (stack1.isEmpty()) {
                        result.add(line);
                        line = new ArrayList<Integer>();
                    }
                }
                //偶数行，逆序打印
            } else {
                while (!stack2.isEmpty()) {
                    node = stack2.pop();
                    line.add(node.val);
                    //先存right子节点，再存left子节点
                    if (node.right != null) {
                        stack1.push(node.right);
                    }
                    if (node.left != null) {
                        stack1.push(node.left);
                    }
                    //当堆栈为空，说明该行节点遍历完毕
                    if (stack2.isEmpty()) {
                        result.add(line);
                        line = new ArrayList<Integer>();
                    }
                }
            }
            flag = !flag;
        }
        return result;
    }







}
