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
            

            for(int i=0 ; i<size ; i++){
                TreeNode curr = q.poll();

                lev.add(curr.val);

                if(curr.left!=null){
                    q.offer(curr.left);
                }

                if(curr.right!=null){
                    q.offer(curr.right);
                }

            }

            rs.add(lev);

        }
        return rs; 
    }
}
