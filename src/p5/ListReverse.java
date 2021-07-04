package p5;

/**
 * 链表反转
 * @author HaibiaoXu
 * @date Create in 15:45 2021/6/18
 * @modified By
 */
public class ListReverse {
    public static void main(String[] args) {
        Node n5 = new Node(5, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        Node rs = reverse(n1);
        while (rs != null) {
            System.out.println(rs.val);
            rs = rs.next;
        }
    }

    public static Node reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node p = head;
        Node q = p.next;
        p.next = null;
        while (q != null) {
            Node tmp = q.next;
            q.next = p;
            p = q;
            q = tmp;
        }
        return p;
    }
}
