package ll;

import java.util.LinkedList;

public class MergeNodes_2181 {
     class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeNodes(ListNode head) {
//         ListNode temp = head;
//         int sum = 0;
//         LinkedList<Integer> ll = new LinkedList<>();
//         while (temp != null){
//             while (temp.next.val == 0){
//                sum += temp.val;
//                temp = temp.next;
//             }
//             if (sum > 0){
//                 ll.add(sum);
//             }
//         }

        ListNode node = head.next;
        ListNode temp = node;
        while (temp != null){
            int sum = 0;
            while (temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            }
            node.val = sum;
            temp = temp.next;
            node.next = temp;
            node = temp;
        }
        head = head.next;
        return head;
    }
}
