/*
 * PROBLEM: Path Sum
 * STATEMENT: Ek Binary Tree ka 'root' aur ek integer 'targetSum' diya hai. Aapko check karna hai ki kya tree mein ROOT se lekar kisi LEAF node tak ka koi aisa path exist karta hai jahan ke saare nodes ki values ka sum 'targetSum' ke barabar ho.
 * Leaf Node ka matlab hota hai jiska na koi left bacha ho aur na hi koi right bacha ho (no children).
 * EXAMPLE: root = [5, 4, 8, 11, null, 13, 4], targetSum = 22
 * Output: true
 * (Path: 5 -> 4 -> 11 -> 2 hai, jiska sum 5 + 4 + 11 + 2 = 22 hai)
 */

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 5 );
        root.left = new TreeNode ( 4 );
        root.right = new TreeNode ( 8 );
        root.left.left = new TreeNode ( 11 );

        int target = 20;

        boolean result = hasPathSum ( root, target );

        System.out.println ( "Path Exist? " + result );
    }

    public static boolean hasPathSum(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return target == root.val;
        }

        int remainingSum = target - root.val;

        return hasPathSum ( root.left, remainingSum ) || hasPathSum ( root.right, remainingSum );
    }
}
