/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {

        if (head == null || k <= 0) {
            return -1;
        }

        Node prev = head;
        Node curr = head;

        // Maintain a gap of k-1 nodes
        for (int i = 1; i < k; i++) {

            curr = curr.next;

            if (curr == null) {
                return -1; // k > length
            }
        }

        // Move both pointers
        while (curr.next != null) {
            curr = curr.next;
            prev = prev.next;
        }

        return prev.data;
    }
}