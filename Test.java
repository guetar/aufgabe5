
import java.util.HashSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steff
 */
public class Test {
    
    public static void main(String[] args) {
        
        String a = "abc";
        Integer x = 3;
        Character c = 'X';
        
        Set set = new Set();
        set.insert(a);
        set.insert(x);
        set.insert(c);
        Iterator it = set.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
