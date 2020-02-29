class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListNode = new ListNode(0);
        int carry = 0;
        ListNode temp = newListNode;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return newListNode.next;
        }
    }