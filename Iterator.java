
/**
 *
 * @author steff
 */
public class Iterator<S> implements java.util.Iterator<S> {
    
    protected abstractNode<S> pos;
    
    public Iterator(abstractNode<S> head) {
        pos = head;
    }
    
    @Override
    public boolean hasNext() {
        return pos != null && pos.getElem() != null;
    }
    
    @Override
    public S next() {
        if (hasNext()) {
            S s = pos.getElem();
            pos = pos.getNext();
            return s;
        }
        return null;
    }
    
    public void add(S elem) {
        if (pos.getElem() != null) {
            abstractNode<S> prev = pos.getPrev();                
            Node<S> newnode = new Node<S>(elem);
            if (prev != null) {
                newnode.setNext(pos);
                newnode.setPrev(pos.getPrev());
                pos.getPrev().setNext(newnode);
                pos.setPrev(newnode);
            } else if (prev == null) {
                //head
                newnode.setElem(pos.getElem());                
                pos.setElem(elem);
                newnode.setPrev(pos);
                newnode.setNext(pos.getNext());
                pos.setNext(newnode);    
                pos=newnode;
            }
        } else {
            pos.setElem(elem);
        }
    }
    
    @Override
    public void remove() {
        if (pos != null) {
            abstractNode<S> next = pos.getNext();
            abstractNode<S> prev = pos.getPrev();
            if (next != null && prev != null) {
                next.setPrev(prev);
                prev.setNext(next);
                pos = next;
            } else if (next != null && prev == null) {
                pos.setElem(next.getElem());
                pos.setNext(next.getNext());
                next.setPrev(pos);
                next.setElem(null);
                
            } else if (next == null) {
                pos.setElem(null);
            }
        }
    }
}
