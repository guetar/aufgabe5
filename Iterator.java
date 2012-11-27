/**
 *
 * @author steff
 */
public class Iterator<S> implements java.util.Iterator<S> {
    
    protected abstractNode<S> pos;
    
    public Iterator (abstractNode<S> head) {
        pos = head;
    }
    
    @Override
    public boolean hasNext() {
        return pos!= null;
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

    @Override
    public void remove() {
        if (pos != null) {
            abstractNode<S> next = pos.getNext();
            abstractNode<S> prev = pos.getPrev();
            if (next != null && prev != null) {
                next.setPrev(prev);
                prev.setNext(next);
                pos = next;
            }
            else if(next != null && prev == null) {
                pos.setElem(next.getElem());
                pos.setNext(next.getNext());
                next.setPrev(pos);     
                next.setElem(null);

            }
            else if(next == null) {
                pos.setElem(null);
            }
        }
    }
    
    public void add(){
    if (pos != null) {  
    
    }  
    }
}
