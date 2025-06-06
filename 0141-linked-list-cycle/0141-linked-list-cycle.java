// public class Solution{
//     public boolean hasCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         if(head == null || head.next == null)
//         return false;

//         while(slow != fast) {
//             if(fast == null || fast.next == null)
//                 return false;
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return true;
//     }
// }

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }
}
