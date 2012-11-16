
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
