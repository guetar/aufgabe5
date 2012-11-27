
/**
 *
 * @author guetar
 */
public class OrderedNode<S extends Shorter<S>> extends abstractNode<S> {
    
    
    public OrderedNode(S elem) {
        super(elem);
    }
       
    @Override
    public void insert(S elemIns) {
        if(getNext() != null) {
            if(getNext().getElem() != null && getNext().getElem().shorter(elemIns)) {
                getNext().insert(elemIns);
            } else {
                abstractNode<S> helper = getNext();
                setNext(new OrderedNode<S>(elemIns));
                getNext().setPrev(this);
                getNext().setNext(helper);
                helper.setPrev(getNext());
            }
        } else {
            setNext(new OrderedNode<S>(elemIns));
            getNext().setPrev(this);
        }
    }
}
