
/**
 *
 * @author guetar
 */
public class Set<S> implements Iterable<S> {

    private Node<S> head;

    public Set(){
    head=new Node<S>();
    }
    
    @Override
    public Iterator<S> iterator() {
        return new Iterator<S>(head);
    }

    public void insert(S s) {
        if (head == null) {
            head = new Node<S>(s);
        } else {
            head.insert(s);
        }
    }

}
