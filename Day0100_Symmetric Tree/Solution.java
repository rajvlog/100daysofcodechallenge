/* Symmetric Tree
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center). */

class Solution {
    private boolean check(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null){
            return root1==root2;
        }
        return root1.val==root2.val && check(root1.left,root2.right) && check(root1.right,root2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
}