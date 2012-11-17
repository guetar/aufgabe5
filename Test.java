

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
        
        Description blah = new Description("blah");
        Description buhu = new Description("buhuludubudulu");
        Description baeh = new Description("Ich bin ein Poltergeist!");
        Description haha = new Description("hahahahahahahahahahha");
        Description buuh = new Description("buhhhhhh");
        
        OrderedSet oSet = new OrderedSet();
        
        oSet.insert(buhu);
        oSet.insert(blah);
        oSet.insert(haha);
        oSet.insert(baeh);
        
        oSet.insert(buuh);
        
        Iterator is = oSet.iterator();
        System.out.println(is.next());
        System.out.println(is.next());
        System.out.println(is.next());
        System.out.println(is.next());
        System.out.println(is.next());
    }
}
