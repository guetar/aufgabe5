
/**
 *
 * @author guetar
 */
public abstract class Shorter<S> {
    
    private S prev;
    private S next;
    
    public abstract boolean shorter(S s);
    
    public void setPrev(S s) {
        this.prev = s;
    }
    
    public void setNext(S s) {
        this.next = s;
    }
    
    public S getPrev() {
        return prev;
    }
    
    public S getNext() {
        return next;
    }
}