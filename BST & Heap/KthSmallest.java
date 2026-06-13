/*
 * PROBLEM: Kth Smallest Element in a BST
 * STATEMENT: Ek Binary Search Tree (BST) ka 'root' aur ek integer 'k' diya hai.
 * Aapko is BST ke saare nodes mein se 'k'-th smallest (sabse choti) value return karni hai.
 * Note: 'k' 1-indexed hai (yaani k=1 matlab sabse chota element).
 * EXAMPLE: root = [3, 1, 4, null, 2], k = 1 -> Output: 1
 * root = [5, 3, 6, 2, 4, null, null, 1], k = 3 -> Output: 3
 */

public class KthSmallest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 3 );
        root.left = new TreeNode ( 1 );
        root.right = new TreeNode ( 4 );
        root.left.right = new TreeNode ( 2 );

        int k = 2;
        int output = kthSmallest ( root, k );

        System.out.println ( "Answer: " + output );
    }

    private static int counter = 0;
    private static int result = -1;

    public static int kthSmallest(TreeNode root, int k) {
        counter = k;
        result = -1;

        inOrder ( root );
        return result;
    }

    private static void inOrder(TreeNode root) {
        if (root == null || result != -1) {
            return;
        }

        inOrder ( root.left );

        counter--;
        if (counter == 0) {
            result = root.val;
            return;
        }

        inOrder ( root.right );
    }
}
