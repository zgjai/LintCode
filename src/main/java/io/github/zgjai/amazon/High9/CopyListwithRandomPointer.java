package io.github.zgjai.amazon.High9;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the
 * list or null.
 *
 * Return a deep copy of the list.
 *
 * Challenge Could you solve it with O(1) space?
 */
public class CopyListwithRandomPointer {
    /**
     * @param head: The head of linked list with a random pointer.
     * @return: A new head of a deep copy of the list.
     */
    public RandomListNode copyRandomList(RandomListNode head) {
        // write your code here
    }

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }
}
