class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public int height(TreeNode node){
        if(null == node){
            return 0;
        }

        int leftH = height(node.left);
        if(-1 == leftH){
            return -1;
        }

        int rightH = height(node.right);
        if(-1 == rightH){
            return -1;
        }

        if(Math.abs(leftH-rightH)> 1){
            return -1;
        }

        return 1 + Math.max(leftH,rightH);
    }
}

