
/**
 *
 * @author guetar
 */
public class OrderedNode<S extends Shorter> {
    
    private S elem;
    private OrderedNode<S> next;
    
    public OrderedNode() {
        elem = null;
        next = null;
    }

    public OrderedNode(S elem) {
        this.elem = elem;
        this.next = null;
    }
    
    public void insert(S elemIns) {
        if(next != null && next.elem.shorter(elemIns)) {
            next.insert(elemIns);
        } else {
            OrderedNode helper = next;
            next = new OrderedNode(elemIns);
            next.next = helper;
        }
    }
}