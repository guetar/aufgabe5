
/**
 *
 * @author guetar
 */
public class Node<S> {

    private S elem;
    private Node next;

    public Node(S elem) {
        this.elem = elem;
        this.next = null;
    }

    public void insert(S elemIns) {
        if (next != null) {
            next.insert(elemIns);
        } else {
            next = new Node(elemIns);
        }
    }
}