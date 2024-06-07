package week_28;

/**
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
 * following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is
 * connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * Do not modify the linked list.
 * Example 1:
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */

public class LinkedListCycle {

    //solution 1
    public static boolean isPalindrome(ListNode head) {
        //find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the second half of the list
        ListNode prev = null;
        ListNode curr = slow;//the middle node
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev; //curr.next is null, break the link between the middle node and the next node
            prev = curr;
            curr = next;
            //     curr =curr.next; -> if we do this, curr becomes null as we set curr.next as null earlier
            // so, instead we do: current = next , as it points curr.next before it becomes null;
        }

        //check if the first and the second half are identical
        while (prev != null) {
            if (head.val != prev.val) {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    //solution2  - with stack

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean result = isPalindrome(head);
        System.out.println("Is palindrome: " + result);

    }
}
