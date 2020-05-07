/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        TreeNode pA = null;
        TreeNode pB = null;
        Queue<Pair<TreeNode,TreeNode>> q = new LinkedList<>();
        TreeNode tmp = new TreeNode(-1);
        Pair<TreeNode,TreeNode> ele;
        q.add(new Pair<TreeNode,TreeNode>(root,tmp));
        int lvlsize;
        while(!q.isEmpty()){
            lvlsize = q.size();
            while(lvlsize!=0){
                ele = q.peek();
                q.remove();
                if(ele.getKey().val ==x)
                    pA = ele.getValue();
                
                 if(ele.getKey().val ==y)
                    pB = ele.getValue();
                
                   if(ele.getKey().left != null) 
                    q.add(new Pair<TreeNode, TreeNode>(ele.getKey().left, ele.getKey())); 
  
                if(ele.getKey().right != null) 
                    q.add(new Pair<TreeNode, TreeNode>(ele.getKey().right, ele.getKey())); 
                
                lvlsize--;
                       if(pA != null && pB != null) 
                    break; 
            }
            if(pA != null && pB != null) 
                return pA != pB;
            
             if ((pA!=null && pB==null) || (pB!=null && pA==null)) 
                return false; 
        }
     
        return false; 
    }
}