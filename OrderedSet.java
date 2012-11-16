
/**
 *
 * @author guetar
 */
public class OrderedSet<S extends Shorter> extends Set {
    private OrderedNode head;
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator<S>(head);
    }
    
    public void insert(S s) {
        if(head == null) {
            head = new OrderedNode(s);
        } else {
            head.insert(s);
        }
    }
}