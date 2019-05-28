package DoublyLinkedList;

public class Node {
    public Integer value;
    public Node previous;
    public Node next;
    static int countNodes = 0;


    public Node(Integer val) {
        this.value = val;
        this.previous = null;
        this.next = null;
        countNodes++;

    }
    public int size() {
        return countNodes;
    }
}
