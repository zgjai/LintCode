package io.github.zgjai.amazon;

/**
 * There is a one-dimensional board with a starting point on the far left side of the board and an end point on the far
 * right side of the board. There are several positions on the board that are connected to other positions, ie if A is
 * connected to B, then when chess falls at position A, you can choose whether to move the chess from A to B. And the
 * connection is one way, which means that the chess cannot move from B to A. Now you have a six-sided dice, find the
 * minimum steps to reach the end.
 *
 * the index starts from 1.
 * length > 1
 * The starting point is not connected to any other location
 * connections[i][0] < connections[i][1]
 * 
 * Example input:
 * length = 10
 * connections = [[2, 10]]
 * output: 1
 */
public class ModernLudoI {
    /**
     * @param length: the length of board
     * @param connections: the connections of the positions
     * @return: the minimum steps to reach the end
     */
    public int modernLudo(int length, int[][] connections) {
        // Write your code here
        return 0;
    }
}
