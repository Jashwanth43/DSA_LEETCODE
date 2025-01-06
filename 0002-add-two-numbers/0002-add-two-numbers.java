class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize dummy node to build the resulting linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Iterate through both linked lists until both are null
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from the current nodes or 0 if the list has ended
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            // Create a new node for the current digit
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in the linked lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the next node of the dummy, which is the head of the result list
        return dummy.next;
    }
}
