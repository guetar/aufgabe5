
/**
 *
 * @author guetar
 */
public class OrderedNode<S> extends Node<S> {
    
    public OrderedNode(Class<S> elem) {
        super(elem);
    }

    public void insertOrdered(S elemIns) {
        OrderedNode next = (OrderedNode) getNext();
        
        if (next != null && next.getElem().shorter(elemIns)) {
            next.insertOrdered(elemIns);
        } else {
            next.setNext(elemIns);
        }
    }
}