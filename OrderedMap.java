/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guetar
 */
public class OrderedMap<S extends Shorter<S>,T> extends OrderedSet<S>{
    
    @Override
    public MapIterator<S,T> iterator() {
        return new MapIterator<S,T>(head);
    }
    
}
