class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return diameter;
    }

    int traverse(TreeNode temp) {
        if (temp == null) {
            return 0;
        }

        int left = traverse(temp.left);
        int right = traverse(temp.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}