

/**
 *
 * @author guetar
 */
public class Set<S> implements Iterable<S> {
    private Node head;    
    
    public Set () {
        head = new Node();
    }
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator(head);
    }
 
    public void insert(S s) {
        head.insert(s);
    }
}