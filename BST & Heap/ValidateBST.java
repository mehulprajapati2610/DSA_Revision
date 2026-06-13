/*
 * PROBLEM: Validate BST
 * STATEMENT: Ek Binary Tree ka 'root' diya hai. Aapko check karna hai ki kya yeh ek valid Binary Search Tree (BST) hai ya nahi.
 * BST Rule: Har node ka left child usse chota hona chahiye, aur right child usse bada hona chahiye. Yeh rule sirf immediate child par nahi, balki poore subtree par apply hota hai.
 * EXAMPLE: root = [2, 1, 3] -> Output: true
 * root = [5, 1, 4, null, null, 3, 6] -> Output: false (Kyunki 3, root 5 ke right me hai par 5 se chota hai)
 */
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

public class ValidateBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 5 );
        root.left = new TreeNode ( 3 );
        root.right = new TreeNode ( 7 );

        boolean result = isValid ( root );

        System.out.println ( "this is valid BST? " + result );
    }

    public static boolean isValid(TreeNode root) {
        return validate ( root, Long.MIN_VALUE, Long.MAX_VALUE );
    }

    private static boolean validate(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return validate ( root.left, min, root.val ) && validate ( root.right, root.val, max );
    }
}
