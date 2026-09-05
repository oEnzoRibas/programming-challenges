package LC2_AssTwoNumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode curentNode = head;
        int c_out = 0;

        while (l1 != null || l2 != null){
            // defines the values to l1/l2 (could be the value or 0 for null)
            int l1_val = (l1 != null)  ? l1.val : 0;
            int l2_val = (l2 != null)  ? l2.val : 0;

            int current_sum = l1_val + l2_val + c_out;
            c_out = current_sum / 10;
            int last_digit = current_sum % 10;

            curentNode.next = new ListNode(last_digit);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            curentNode = curentNode.next;
        }
        if (c_out > 0){
            ListNode new_node = new ListNode(c_out);
            curentNode.next = new_node;
            curentNode = curentNode.next;
        }
        return head.next;
    }
}