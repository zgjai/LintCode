package io.github.zgjai.amazon.High9;

/**
 * Given some points and a point origin in two dimensional space, find k points out of the some points which are nearest
 * to origin. Return these points sorted by distance, if they are same with distance, sorted by x-axis, otherwise sorted
 * by y-axis.
 *
 * Example Given points = [[4,6],[4,7],[4,4],[2,5],[1,1]], origin = [0, 0], k = 3 return [[1,1],[2,5],[4,4]]
 */
public class KClosestPoints {
    /**
     * @param points: a list of points
     * @param origin: a point
     * @param k: An integer
     * @return: the k closest points
     */
    public Point[] kClosest(Point[] points, Point origin, int k) {
        // write your code here
    }

    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }
}
