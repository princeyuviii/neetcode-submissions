class Solution {
    public int maxDepth(TreeNode root) {
        if(null==root){
            return 0;
        }

        int lD = maxDepth(root.left);
        int rD = maxDepth(root.right);

        return 1 + Math.max(lD,rD);
    }
}
