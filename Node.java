
/**
 *
 * @author guetar
 */
public class Node<S> extends abstractNode<S> {


    public Node() {
        super();
    }

    public Node(S elem) {
        super(elem);
    }

    @Override
    public void insert(S elemIns) {
        if (getNext() != null) {
            getNext().insert(elemIns);
        } else {
            setNext(new Node<S>(elemIns));
            getNext().setPrev(this);
        }
    }
  
}
