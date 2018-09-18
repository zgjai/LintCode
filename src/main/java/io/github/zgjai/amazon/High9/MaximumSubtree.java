package io.github.zgjai.amazon.High9;

/**
 * Given a binary tree, find the subtree with maximum sum. Return the root of the subtree.
 *
 * Example Given a binary tree:
 *
 * 1 / \ -5 2 / \ / \ 0 3 -4 -5 return the node with value 3.
 *
 * Notice LintCode will print the subtree which root is your return node. It's guaranteed that there is only one subtree
 * with maximum sum and the given binary tree is not an empty tree.
 */
public class MaximumSubtree {
    /**
     * @param root: the root of binary tree
     * @return: the maximum weight node
     */
    public TreeNode findSubtree(TreeNode root) {
        // write your code here
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
