

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
        
        String a = "a";
        Integer b = 2;
        Character c = 'c';
        String d = "d";
        
        Set set = new Set();
        set.insert(a);
        set.insert(b);
        set.insert(c);
        set.insert(d);
        Iterator it = set.iterator();

        
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
