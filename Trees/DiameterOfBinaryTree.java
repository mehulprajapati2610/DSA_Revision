/*
 * PROBLEM: Diameter of Binary Tree
 * STATEMENT: Ek Binary Tree ka 'root' diya hai. Aapko us tree ka DIAMETER nikalna hai.
 * Binary Tree ka diameter longest path ki length hoti hai jo tree ke kisi bhi DO NODES ke beech mein ho.
 * Yeh path root se hokar guzar bhi sakta hai aur nahi bhi. Path ki length ka matlab hai us raste mein aane wale EDGES ki ginti.
 * EXAMPLE: root = [1, 2, 3, 4, 5] -> Output: 3
 * (Longest path 4 -> 2 -> 1 -> 3 ya 5 -> 2 -> 1 -> 3 hai, jisme 3 edges hain)
 */

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 1 );
        root.left = new TreeNode ( 2 );
        root.right = new TreeNode ( 3 );
        root.left.left = new TreeNode ( 4 );
        root.left.right = new TreeNode ( 5 );

        int result = diameterOfBinaryTree ( root );

        System.out.println ( "Diameter of the Binary Tree: " + result );
    }

    private static int maxDiameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight ( root );
        return maxDiameter;
    }

    private static int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateHeight ( root.left );
        int rightHeight = calculateHeight ( root.right );

        maxDiameter = Math.max ( maxDiameter, leftHeight + rightHeight );

        return 1 + Math.max ( leftHeight, rightHeight );

    }
}
