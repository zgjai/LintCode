package io.github.zgjai.SegmentTree;

/**
 * For an integer array (index from 0 to n-1, where n is the size of this array), in the corresponding SegmentTree, each node stores an extra attribute max to denote the maximum number in the interval of the array (index from start to end).
 *
 * Design a query method with three parameters root, start and end, find the maximum number in the interval [start, end] by the given root of segment tree.
 *
 * Example
 * For array [1, 4, 2, 3], the corresponding Segment Tree is:
 *
 *                   [0, 3, max=4]
 *                  /             \
 *           [0,1,max=4]        [2,3,max=3]
 *           /         \        /         \
 *    [0,0,max=1] [1,1,max=4] [2,2,max=2], [3,3,max=3]
 * query(root, 1, 1), return 4
 *
 * query(root, 1, 2), return 4
 *
 * query(root, 2, 3), return 3
 *
 * query(root, 0, 2), return 4
 */
public class SegmentTreeQuery {
    /**
     * @param root: The root of segment tree.
     * @param start: start value.
     * @param end: end value.
     * @return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
    }

    class SegmentTreeNode {
        public int start, end, max;
        public SegmentTreeNode left, right;

        public SegmentTreeNode(int start, int end, int max) {
            this.start = start;
            this.end = end;
            this.max = max;
            this.left = this.right = null;
        }
    }
}
