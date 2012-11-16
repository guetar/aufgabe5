/**
 *
 * @author steff
 */
public class Iterator<S> implements java.util.Iterator<S> {
    private Node<S> pos;
    
    public Iterator (Node<S> head) {
        pos = head;
    }

    @Override
    public boolean hasNext() {
        return pos != null;
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
        Node<S> next = pos.getNext();
        Node<S> prev = pos.getPrev();
        if (next != null && prev != null) {
            
        }
    }
}
