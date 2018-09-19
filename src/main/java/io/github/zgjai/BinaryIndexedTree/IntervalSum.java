package io.github.zgjai.BinaryIndexedTree;

import java.util.List;

/**
 * Given an integer array (index from 0 to n-1, where n is the size of this array), and an query list.
 * Each query has two integers [start, end]. For each query, calculate the sum number
 * between index start and end in the given array, return the result list.
 *
 * Example
 * For array [1,2,7,8,5], and queries [(0,4),(1,2),(2,4)], return [23,9,20]
 *
 * Challenge
 * O(logN) time for each query
 *
 * Notice
 * We suggest you finish problem Segment Tree Build, Segment Tree Query and Segment Tree Modify first.
 */
public class IntervalSum {
    /**
     * @param A: An integer list
     * @param queries: An query list
     * @return: The result list
     */
    public List<Long> intervalSum(int[] A, List<Interval> queries) {
        // write your code here
    }

    class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
