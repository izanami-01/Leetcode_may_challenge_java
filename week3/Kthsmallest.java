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
    public int kthSmallest(TreeNode root, int k) {
     AtomicInteger cc = new AtomicInteger();
         AtomicInteger rr = new AtomicInteger();
        inorder(root , k , cc ,rr);
        return rr.get();
}
     private void inorder(TreeNode root ,int k , AtomicInteger cc , AtomicInteger rr ){
         if(root.left!=null)
             inorder(root.left,k,cc,rr);
         cc.getAndIncrement();
         if(cc.get()==k){
             rr.set(root.val);
             return ;
         }
         if(root.right!=null)
               inorder(root.right,k,cc,rr);
     }
}