/*
 * PROBLEM: Maximum Depth of Binary Tree
 * STATEMENT: Ek Binary Tree ka 'root' diya hai, aapko uski MAXIMUM DEPTH (yaani height) nikalni hai.
 * Maximum Depth ka matlab hai root node se lekar sabse door wale leaf node tak ke longest path mein kitne nodes aate hain.
 * EXAMPLE: root = [3, 9, 20, null, null, 15, 7] -> Output: 3
 * (Path: 3 -> 20 -> 7 ya 3 -> 20 -> 15 mein 3 nodes hain)
 */

public class MaxDepth {
    public static void main(String[] args) {

        TreeNode root = new TreeNode ( 3 );
        root.left = new TreeNode ( 9 );
        root.right = new TreeNode ( 20 );
        root.right.left = new TreeNode ( 15 );
        root.right.right = new TreeNode ( 7 );

        int depth = maxDepth ( root );

        System.out.println ( "Maximum Depth of the Binary Tree: " + depth );
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth ( root.left );

        int rightHeight = maxDepth ( root.right );

        return 1 + Math.max ( leftHeight, rightHeight );
    }
}
