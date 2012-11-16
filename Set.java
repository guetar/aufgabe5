

/**
 *
 * @author guetar
 */
public class Set<S> implements Iterable<S> {
    private Node<S> head;    
    
    public Set () {
        head = null;
    }
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator(head);
    }
 
    public void insert(S s) {
        if (head == null) {
            head = new Node(s);
        } else {
            head.insert(s);
        }
    }
}