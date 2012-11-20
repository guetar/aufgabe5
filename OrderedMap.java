/**
 *
 * @author guetar
 */
public class OrderedMap<S extends Shorter<S>,T> extends OrderedSet<S>{
    
    private MapNode<S,T> head; 
    
    @Override
    public MapIterator<S,T> iterator() {
        return new MapIterator<S,T>(head);
    }
    
    @Override
    public void insert(S s) {
        if (head == null) {
            head = new MapNode<S, T>(s);
        } else if (s.shorter(head.getElem())) {
            MapNode<S, T> helper = head;
            head = new MapNode<S, T>(s);
            head.setNext(helper);
            helper.setPrev(head);
        } else {
            head.insert(s);
        }
    }
    
}
