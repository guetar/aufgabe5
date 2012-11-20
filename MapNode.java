/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthias
 */
public class MapNode<S,T> extends Node<S>{
    Set<T> set;
    
    public MapNode(){
    super();
    }
    
    public MapNode(S elem) {
        setElem(elem);       
    }
 
    public void add(T el){
    set.insert(el);
    }
    
    public Set<T> getSet(){
    return set;
    }

}
