package newCode;

/**
 * @author vanguo996
 */


public class TreeNode {
    int value = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
