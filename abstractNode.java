
/**
 *
 * @author Matthias
 */
public abstract class abstractNode<S> {

    private S elem;
    private abstractNode<S> next;
    private abstractNode<S> prev;

    public abstractNode() {
        elem = null;
        next = null;
        prev = null;
    }

    public abstractNode(S elem) {
        this.elem = elem;
        this.next = null;
    }

    public abstract void insert(S elemIns);
  
    public boolean hasNext() {
        return (next != null);
    }

    public void setElem(S elem) {
        this.elem=elem;
    }
        
    public void setNext(abstractNode<S> nextN) {
        next = nextN;
    }
       
    public abstractNode<S> getNext() {
        return next;
    }

    public void setPrev(abstractNode<S> prevN) {
        prev = prevN;
    }

    public abstractNode<S> getPrev() {
        return prev;
    }

    public S getElem() {
        return elem;
    }
}
