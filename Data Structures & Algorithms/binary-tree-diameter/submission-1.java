class Solution {
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return d;
    }

    private int dfs(TreeNode root){
        if(root==null){
            return 0;
        }

        int ld = dfs(root.left);
        int rd = dfs(root.right);

        d = Math.max(d,ld+rd);

        return 1 + Math.max(ld,rd);
    }
}
