//Name : محمود قناوي محمود أبو عمر.
//Section : 12


package labofdatastructure;

import java.util.Stack;

public class TreeTraversalPreOrder {

    public static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.printf("%d ", root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void preorderIter(TreeNode root) {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {

            TreeNode n = stack.pop();
            System.out.printf("%d ", n.data);

            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
    }
}
