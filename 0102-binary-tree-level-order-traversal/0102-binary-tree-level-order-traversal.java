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
 import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        /**
Use a queue (like collections.deque in Python).
Start by adding the root node to the queue.
While the queue is not empty:
Get the number of nodes at the current level (len(queue)).
For each node at that level:
Pop it from the queue.
Add its value to a list for that level.
Enqueue its left and right children (if they exist).
Append the level's list to your result after each iteration.
        
        **/
        List<List<Integer>> result = new ArrayList<>();
          if (root == null) return result;
        Queue<TreeNode>  que= new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int n = que.size();
            List<Integer> level=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                TreeNode node =que.poll();
               level.add( node.val);
               if(node.left!=null)  que.offer(node.left);
               if(node.right!=null)  que.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }

}