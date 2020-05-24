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
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode top = new TreeNode();
         top.val = 29000000;
        stack.push(top);
        TreeNode temp ,p = null;
        int i =0;
        TreeNode root = new TreeNode();
        root.val = preorder[i++];
        root.left = root.right = null;
        p = root;
        while(i<n){
            if(preorder[i]<p.val){
                temp = new TreeNode();
                temp.val = preorder[i++];
                temp.left = temp.right = null;
                p.left = temp;
                stack.push(p);
                p = temp;
            }
            else if(preorder[i]>p.val && preorder[i]<stack.peek().val){
                temp = new TreeNode();
                temp.val = preorder[i++];
                temp.left = temp.right = null;
                p.right = temp ;
                p = temp;
            }
            else{
                p = stack.pop();
            }
        }
        return root;
    }
}