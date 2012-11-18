
/**
 *
 * @author guetar
 */
public class OrderedSet<S extends Shorter<S>> extends Set {
    
    protected OrderedNode<S> head;
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator<S>(head);
    }
    
    public void insert(S s) {
        if(head == null) {
            head = new OrderedNode<S>(s);
        } else if(s.shorter(head.getElem())) {
            OrderedNode<S> helper = head;
            head = new OrderedNode<S>(s);
            head.setNext(helper);
            helper.setPrev(head);
        } else {
            head.insert(s);
        }
    }
}
