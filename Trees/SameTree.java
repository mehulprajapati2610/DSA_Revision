/*
 * PROBLEM: Same Tree
 * STATEMENT: Do Binary Trees ke roots 'p' aur 'q' diye hain. Aapko ek function likhna hai jo check kare ki kya yeh dono trees BILKUL SAME (identical) hain ya nahi.
 * Do binary trees tabhi same maane jayenge jab unka structure ekdum same ho aur unke respective nodes ki values bhi exact match karti hon.
 * EXAMPLE: p = [1, 2, 3], q = [1, 2, 3] -> Output: true
 * p = [1, 2],    q = [1, null, 2] -> Output: false
 */

import com.sun.source.tree.Tree;

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode ( 1 );
        p.left = new TreeNode ( 2 );
        p.right = new TreeNode ( 3 );

        TreeNode q = new TreeNode ( 1 );
        q.left = new TreeNode ( 2 );
        q.right = new TreeNode ( 3 );

        boolean result = isSameTree ( p, q );

        System.out.println ( "both are same? " + result );
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree ( p.left, q.left ) && isSameTree ( p.right, q.right );
    }
}
