public class PS2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            // Dummy node to make building the result list easier
            ListNode h1 = new ListNode(0);

            // current points to the last node in our result list
            ListNode current = h1;

            // Stores the carry from the previous addition
            int carry = 0;

            // Continue while either list has nodes or there is a remaining carry
            while (l1 != null || l2 != null || carry != 0) {

                // If l1 is finished, use 0
                int v1 = (l1 != null) ? l1.val : 0;

                // If l2 is finished, use 0
                int v2 = (l2 != null) ? l2.val : 0;

                // Add both values along with the carry
                int val = v1 + v2 + carry;

                // Create a new node containing only the current digit
                current.next = new ListNode(val % 10);

                // Move current to the newly created node
                current = current.next;

                // Calculate the carry for the next iteration
                carry = val / 10;

                // Move l1 to its next node if it still exists
                if (l1 != null) {
                    l1 = l1.next;
                }

                // Move l2 to its next node if it still exists
                if (l2 != null) {
                    l2 = l2.next;
                }
            }

            // Skip the dummy node and return the actual result
            return h1.next;
        }
    }
    public static void main(String[] args) {

        // l1 = [2,4,3] -> 342
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // l2 = [5,6,4] -> 465
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);

        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print result
        while (result != null) {
            System.out.print(result.val);

            if (result.next != null) {
                System.out.print(" -> ");
            }

            result = result.next;
        }
    }
}