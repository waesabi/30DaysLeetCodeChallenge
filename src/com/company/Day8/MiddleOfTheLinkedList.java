package com.company.Day8;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode x = new ListNode(arr[i]);
            temp.next = x ;
            temp = x;
        }

        System.out.println(middleNode(head).val);
    }

    // Accepted 
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        if (temp.next == null) { return temp; }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
}
