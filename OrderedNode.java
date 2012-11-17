
/**
 *
 * @author guetar
 */
public class OrderedNode<S extends Shorter> extends Node<S> {
    
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
        if(next != null) {
            if(next.getElem() != null && next.getElem().shorter(elemIns)) {
                next.insert(elemIns);
            } else {
                OrderedNode<S> helper = next;
                next = new OrderedNode(elemIns);
                next.setNext(helper);
            }
        } else {
            next = new OrderedNode(elemIns);
        }
    }
}
