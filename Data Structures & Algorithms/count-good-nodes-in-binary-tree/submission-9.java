class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    private int dfs(TreeNode root, int mx){
        if(root==null){
            return 0;
        }

        int good = 0;

        if(root.val >= mx){
            good = 1;
        }

        mx = Math.max(root.val, mx);

        int left = dfs(root.left, mx);
        int right = dfs(root.right, mx);

        return good+left+right;
    }
}
