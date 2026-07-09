
class Solution {
    private int dia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }
    
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }

        int lH = height(node.left);
        int rH = height(node.right);

        dia = Math.max(dia,lH+rH);
    
        return 1+Math.max(lH,rH);
    }
    
}