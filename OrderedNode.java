
/**
 *
 * @author guetar
 */
public class OrderedNode<S extends Shorter<S>> extends Node<S> {
    
    private OrderedNode<S> next;
    private OrderedNode<S> prev;
    
    public OrderedNode(S elem) {
        this.setElem(elem);
    }
    
    @Override
    public OrderedNode<S> getNext() {
        return next;
    }
    
    public void setNext(OrderedNode<S> nextN) {
        this.next = nextN;
    }
    
    public OrderedNode<S> getPrev() {
        return prev;
    }
    
    public void setPrev(OrderedNode<S> prevN) {
        this.prev = prevN;
    }
    
    
    @Override
    public void insert(S elemIns) {
        if(next != null) {
            if(next.getElem() != null && next.getElem().shorter(elemIns)) {
                next.insert(elemIns);
            } else {
                OrderedNode<S> helper = next;
                next = new OrderedNode<S>(elemIns);
                next.setPrev(this);
                next.setNext(helper);
                helper.setPrev(next);
            }
        } else {
            next = new OrderedNode<S>(elemIns);
            next.setPrev(this);
        }
    }
}
