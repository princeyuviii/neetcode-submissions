class Solution {

    int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(preorder, inorder, 0, inorder.length - 1);
    }

    private TreeNode dfs(int[] preorder, int[] inorder,
                         int left, int right) {

        if (left > right)
            return null;

        TreeNode root = new TreeNode(preorder[preorderIndex++]);

        int index = 0;

        while (inorder[index] != root.val)
            index++;

        root.left = dfs(preorder, inorder, left, index - 1);

        root.right = dfs(preorder, inorder, index + 1, right);

        return root;
    }
}