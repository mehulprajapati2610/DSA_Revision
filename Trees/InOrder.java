/*
 * PROBLEM: Binary Tree Inorder Traversal
 * STATEMENT: Ek Binary Tree ka 'root' diya hai. Uske saare nodes ki values ka INORDER traversal return karna hai.
 * Inorder Order: Left Subtree -> Current Root Node -> Right Subtree (LNR)
 * EXAMPLE: root = [1, null, 2, 3] -> Output: [1, 3, 2]
 */

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class InOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 1 );
        root.right = new TreeNode ( 2 );
        root.right.left = new TreeNode ( 3 );

        List<Integer> output = inOrderTranversal ( root );

        System.out.println ( "Inorder values for given Tree: " + output );
    }

    public static List<Integer> inOrderTranversal(TreeNode root) {
        List<Integer> result = new ArrayList<> ();
        helper ( root, result );
        return result;
    }

    private static void helper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        helper ( node.left, result );
        result.add ( node.val );
        helper ( node.right, result );
    }
}
