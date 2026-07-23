class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();

        if(root==null){
            return rs;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> lev = new ArrayList<>();

            for(int i=0; i<size; i++){
                TreeNode el = q.poll();
                lev.add(el.val);

                if(el.left != null){
                    q.offer(el.left);
                }

                if(el.right != null){
                    q.offer(el.right);
                }
            }

            rs.add(lev);
        }
        return rs;
     }
     
}
