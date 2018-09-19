package io.github.zgjai.SegmentTree;

import java.util.List;

/**
 * Given an integer array (index from 0 to n-1, where n is the size of this array),
 * and an query list. Each query has two integers [start, end].
 * For each query, calculate the minimum number between index start and end in the given array,
 * return the result list.
 *
 * Example
 * For array [1,2,7,8,5], and queries [(1,2),(0,4),(2,4)], return [2,1,5]
 *
 * Challenge
 * O(logN) time for each query
 */
public class IntervalMinimumNumber {
    /**
     * @param A: An integer array
     * @param queries: An query list
     * @return: The result list
     */
    public List<Integer> intervalMinNumber(int[] A, List<Interval> queries) {
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
