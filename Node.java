
/**
 *
 * @author guetar
 */
public class Node<S> {

    private S elem;
    private Node<S> next;
    private Node<S> prev;

    public Node() {
        elem = null;
        next = null;
        prev = null;
    }

    public Node(S elem) {
        this.elem = elem;
        this.next = null;
    }

    public void insert(S elemIns) {
        if (next != null) {
            next.insert(elemIns);
        } else {
            next = new Node<S>(elemIns);
            next.setPrev(this);
        }
    }
  
    public boolean hasNext() {
        return (next != null);
    }

    public void setNext(Node<S> nextN) {
        next = nextN;
    }
    
    public Node<S> getNext() {
        return next;
    }

    public void setPrev(Node<S> prevN) {
        prev = prevN;
    }

    public Node<S> getPrev() {
        return prev;
    }

    public S getElem() {
        return elem;
    }
}
