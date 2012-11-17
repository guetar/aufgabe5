
/**
 *
 * @author Matthias
 */
public class MapElementIterator<S> extends Iterator<S> {

    public MapElementIterator(Node<S> head) {
        super(head);
    }

    public void add(S s) {
        Node oldpos = pos;
        pos = new Node(s);
        pos.setNext(oldpos);
        pos.setPrev(oldpos.getPrev());
        oldpos.getPrev().setNext(pos);
    }
}
