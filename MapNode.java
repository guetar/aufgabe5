
/**
 *
 * @author Matthias
 */
public class MapNode<S,T> extends Node<S>{
    Set<T> set;
    
    public MapNode(){
    super();
    set=new Set();
    }
    
    public MapNode(S elem) {
        setElem(elem); 
        set=new Set();
    }
 
    public void add(T el){
    set.insert(el);
    }
    
    public Set<T> getSet(){
    return set;
    }

}
