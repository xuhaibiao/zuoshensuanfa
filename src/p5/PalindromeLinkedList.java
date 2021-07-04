package p5;

/**
 * 判断是否是回文链表
 * 1. 栈结构，空间复杂度 n
 * 2. 借助反转链表和快慢指针，空间复杂度 1
 * 下面给出第二种代码
 * @author HaibiaoXu
 * @date Create in 15:45 2021/6/18
 * @modified By
 */
public class PalindromeLinkedList {
    public static void main(String[] args) {
        Node n6 = new Node(1, null);
        Node n5 = new Node(2, n6);
        Node n4 = new Node(3, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        Boolean rs = isPalindromeLinkedList(n1);
        System.out.println(rs);
    }

    public static Boolean isPalindromeLinkedList(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 后半段反转
        Node tail = ListReverse.reverse(slow);
        while (head != null) {
            if (head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
}
