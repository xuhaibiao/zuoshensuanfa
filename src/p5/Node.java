package p5;

/**
 * @author HaibiaoXu
 * @date Create in 15:45 2021/6/18
 * @modified By
 */
public class Node {
    public int val;
    public Node next;
    public Node pre;

    public Node(int v, Node n) {
        val = v;
        next = n;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
