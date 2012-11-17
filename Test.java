
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
        
        Description blah = new Description("blah");
        Description buhu = new Description("buhuludubudulu");
        Description baeh = new Description("Ich bin ein Poltergeist!");
        
        OrderedSet oSet = new OrderedSet();
        oSet.insert(blah);
        oSet.insert(buhu);
        oSet.insert(baeh);
        Iterator is = oSet.iterator();
        System.out.println(is.next());
        System.out.println(is.next());
        System.out.println(is.next());
    }
}
