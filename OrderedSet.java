
/**
 *
 * @author guetar
 */
public class OrderedSet<S extends Shorter> extends Set {
    
    protected OrderedNode<S> head;
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator<S>(head);
    }
    
    public void insert(S s) {
        if(head == null) {
            head = new OrderedNode(s);
        } else if(s.shorter(head.getElem())) {
            OrderedNode helper = head;
            head = new OrderedNode(s);
            head.setNext(helper);
            helper.setPrev(head);
        } else {
            head.insert(s);
        }
    }
}
