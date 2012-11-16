
import java.util.Iterator;

/**
 *
 * @author guetar
 */
public abstract class Set<S> implements Iterable<S> {
    private Node head;

    private class Node {
        private S elem;
        private Node next;
        
        private Node(S elem) {
            this.elem = elem;
            this.next = null;
        }
        
        private void insert(S elemIns) {
            if (next != null) {
                next.insert(elemIns);
            }
            else {
                next = new Node(elemIns);
            }
        }
    }
    
    private class MyIterator implements Iterator<S> {
        private Node pos = null;

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public S next() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
    
 
    public void insert(S s) {
        head.insert(s);
    }
}