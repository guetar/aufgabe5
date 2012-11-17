
/**
 *
 * @author guetar
 */
public class OrderedNode<S extends Shorter> extends Node<S> {
    
    private S elem;
    private OrderedNode<S> next;
    private OrderedNode<S> prev;
    
    public OrderedNode(S elem) {
        this.elem = elem;
    }
    
    @Override
    public OrderedNode getNext() {
        return next;
    }
    
    public void setNext(OrderedNode<S> nextN) {
        this.next = nextN;
    }
    
    public OrderedNode getPrev() {
        return prev;
    }
    
    public void setPrev(OrderedNode<S> prevN) {
        this.prev = prevN;
    }
    
    public S getElem() {
        return elem;
    }
    
    @Override
    public void insert(S elemIns) {
        if(next != null) {
            if(next.getElem() != null && next.getElem().shorter(elemIns)) {
                next.insert(elemIns);
            } else {
                OrderedNode<S> helper = next;
                next = new OrderedNode(elemIns);
                next.setPrev(this);
                next.setNext(helper);
                helper.setPrev(next);
            }
        } else {
            next = new OrderedNode(elemIns);
            next.setPrev(this);
        }
    }
}
