

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

        
        
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        
        Description d1 = new Description("1");
        Description d2 = new Description("22");
        Description d3 = new Description("333");
        Description d4 = new Description("4444");
        Description d5 = new Description("55555");
        Description d6 = new Description("666666");
        
        
        OrderedSet oSet = new OrderedSet();
        
        oSet.insert(d4);
        oSet.insert(d2);
        oSet.insert(d5);
        oSet.insert(d3);
        oSet.insert(d1);
        oSet.insert(d6);
        
        Iterator is = oSet.iterator();
        
        is.remove();
        System.out.println(is.next());
        System.out.println(is.next());
        is.remove();
        System.out.println(is.next());
        System.out.println(is.next());
        System.out.println(is.next());
        System.out.println(is.next());
        
        
        
        
//        Das geht nicht (found Object). ist diese funktionalitaet erfordert??
//        while (!is.hasNext()) {
//            Description tmp = it.next();
//        }
    }
}
