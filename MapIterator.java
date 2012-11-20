
/**
 *
 * @author Matthias
 */
public class MapIterator<S, T> extends Iterator<S> {

    private MapNode<S,T> pos;

    public MapIterator(MapNode<S,T> head) {
        super(head);
    }
    
    public Iterator<T> iterator() { 
        return pos.set.iterator();
    }
}