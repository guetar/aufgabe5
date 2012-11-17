
/**
 *
 * @author guetar
 */
public class OrderedNode<S extends Shorter> extends Node<S> {
    
    private S elem;
    private OrderedNode<S> next;
    private OrderedNode<S> prev;
    
    public OrderedNode(S elem) {
        super(elem);
    }
    
    @Override
    public OrderedNode getNext() {
        return next;
    }
    
    public void setNext(OrderedNode<S> nextN) {
        this.next = nextN;
    }
    
    @Override
    public void insert(S elemIns) {
        if(next != null && next.elem != null) {
            if(next.elem.shorter(elemIns)) {
                next.insert(elemIns);
            } else {
                OrderedNode<S> helper = getNext();
                next = new OrderedNode(elemIns);
                next.setNext(helper);
            }
        } else {
            next = new OrderedNode(elemIns);
        }
    }
}
