
/**
 *
 * @author Matthias
 */
public class MapIterator<S, T extends Node> extends Iterator<S> {

    private Node<T> pos;

    public MapIterator(Node<S> head) {
        super(head);
    }

    public MapElementIterator<T> iterator() {
        return new MapElementIterator<T>(pos);
    }
}
