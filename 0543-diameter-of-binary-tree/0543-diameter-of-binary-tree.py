# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.max_diameter=0
        def dfs(root):
            
            if not root:
                return 0
            left_height, right_height= dfs(root.left),dfs(root.right)

            diameter_current=left_height+right_height
            self.max_diameter=max(self.max_diameter,diameter_current)
            return 1+max(left_height,right_height)


        dfs(root)
        return(self.max_diameter)