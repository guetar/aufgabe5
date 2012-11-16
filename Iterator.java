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
        return pos.hasNext();
    }

    @Override
    public S next() {
        pos = pos.getNext();
        S s = pos.getElem();
        return s;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
