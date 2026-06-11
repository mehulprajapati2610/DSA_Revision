/*
 * PROBLEM: Binary Tree Level Order Traversal
 * STATEMENT: Ek Binary Tree ka 'root' diya hai. Aapko uske nodes ki values ka LEVEL ORDER traversal return karna hai, yaani level-by-level (left to right) group banakar.
 * Output ek List of Lists hona chahiye, jahan har level ke elements ek alag list mein hon.
 * EXAMPLE: root = [3, 9, 20, null, null, 15, 7]
 * Output: [[3], [9, 20], [15, 7]]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode ( 3 );
        root.left = new TreeNode ( 9 );
        root.right = new TreeNode ( 20 );
        root.right.left = new TreeNode ( 15 );
        root.right.right = new TreeNode ( 7 );

        List<List<Integer>> output = levelOrder ( root );

        System.out.println ( "Level Order Tranversal: " + output );
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<> ();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<> ();
        queue.add ( root );

        while (!queue.isEmpty ()) {
            int levelSize = queue.size ();
            List<Integer> currentLevelList = new ArrayList<> ();

            for (int i = 0 ; i < levelSize ; i++) {
                TreeNode currentNode = queue.poll ();
                currentLevelList.add ( currentNode.val );

                if (currentNode.left != null) {
                    queue.add ( currentNode.left );
                }

                if (currentNode.right != null) {
                    queue.add ( currentNode.right );
                }
            }
            result.add ( currentLevelList );
        }
        return result;
    }
}
