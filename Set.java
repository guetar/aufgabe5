

/**
 *
 * @author guetar
 */
public class Set<S> implements Iterable<S> {
    private Node head;
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator(head);
    }
 
    public void insert(S s) {
        if(head == null) {
            head = new Node(s);
        } else {
            head.insert(s);
        }
    }
}