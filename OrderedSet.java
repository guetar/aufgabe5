
/**
 *
 * @author guetar
 */
public class OrderedSet<S extends Shorter> extends Set {
    private OrderedNode head;
    
    public Iterator iterator() {
        
    }
    
    public boolean insert(S s) {
        if(head == null) {
            head = new Node(s);
        } else {
            head.insert(s);
        }
    }
}