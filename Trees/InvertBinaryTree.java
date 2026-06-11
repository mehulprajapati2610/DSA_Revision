/*
 * PROBLEM: Invert Binary Tree
 * STATEMENT: Ek Binary Tree ka 'root' diya hai. Aapko is tree ko mirror image mein badalna hai (yaani invert karna hai) aur iska naya root return karna hai.
 * Invert karne ka matlab hai ki har ek node ke left aur right subtrees aapas mein swap (badal) jaane chahiye.
 * EXAMPLE: root = [4, 2, 7, 1, 3, 6, 9]
 * Output: [4, 7, 2, 9, 6, 3, 1]
 */

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 4 );
        root.left = new TreeNode ( 2 );
        root.right = new TreeNode ( 7 );

        System.out.println ( "Before Inversion: " );
        printTree ( root );

        TreeNode invertedRoot = invertTree ( root );

        System.out.println ( "After Inversion: " );
        printTree ( invertedRoot );
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode leftInverted = invertTree ( root.left );
        TreeNode rightInverted = invertTree ( root.right );

        root.left = rightInverted;
        root.right = leftInverted;

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<> ();
        queue.add ( root );
        while (!queue.isEmpty ()) {
            TreeNode current = queue.poll ();
            System.out.print ( current.val + " " );
            if (current.left != null) queue.add ( current.left );
            if (current.right != null) queue.add ( current.right );
        }
        System.out.println ();
    }
}
