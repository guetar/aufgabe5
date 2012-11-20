

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
        
        System.out.println("––––––––––––––––––––––––––");
        System.out.println("Test of Set:");
        System.out.println("––––––––––––––––––––––––––");
        
        String a = "a";
        Integer b = 2;
        Character c = 'c';
        String d = "dadaismus";
        
        Set<Object> set = new Set<Object>();
        set.insert(a);
        set.insert(b);
        set.insert(c);
        set.insert(d);
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        //1. Erzeugen Sie eine Instanz von OrderedSet deren Elemente vom Typ 
        //Description sind. Fuegen Sie einige Elemente in unsortierter 
        //Reihenfolge ein, lesen Sie alle Elemente der Menge ueber den Iterator 
        //aus, und schreiben Sie die Anzahlen der Zeilen in die Standard-Ausgabe. 
        //Fuehren Sie Aenderungen durch und geben Sie die Elemente erneut aus. 
        //Diesen Vorgang koennen Sie mit unterschiedlichen Aenderungen so oft 
        //wiederholen, wie es Ihnen als noetig erscheint.
        
        System.out.println("––––––––––––––––––––––––––");
        System.out.println("Test of OrderedSet:");
        System.out.println("––––––––––––––––––––––––––");
        
        Description d1 = new Description("1");
        Description d2 = new Description("22");
        Description d3 = new Description("333");
        Description d4 = new Description("4444");
        Description d5 = new Description("55555");
        Description d6 = new Description("666666");

        OrderedSet<Description> oSet = new OrderedSet<Description>();
        
        oSet.insert(d4);
        oSet.insert(d2);
        oSet.insert(d5);
        oSet.insert(d3);
        oSet.insert(d6);
        oSet.insert(d1);
        
        Iterator<Description> is = oSet.iterator();     
        
        while(is.hasNext()){
            Description des=is.next();
            System.out.println(des.getLineCount()+" Zeile(n):"+des);
        }
        System.out.println("––––––––––––––––––––––––––");
        System.out.println("Entferne 1. und 4.Element:");
        System.out.println("––––––––––––––––––––––––––");
        
        is = oSet.iterator();
        //Entferne 1. und 4. Element
        is.remove();       
        is.next();
        is.next();
        is.remove();       

        //erneute Ausgabe
        is = oSet.iterator();
        while (is.hasNext()) {
            Description des = is.next();
            System.out.println(des.getLineCount() + " Zeile(n):" + des);
        }
        
        //2. Erzeugen Sie eine Instanz von OrderedMap, deren Elemente vom Typ 
        //MeanElapsedTime sind und die auf Objekte vom Typ CompositeTime verweisen – 
        //nicht sehr sinnvoll, aber gut zum Testen geeignet. Fügen Sie einige Elemente 
        //und damit verbundene Objekte ein, lesen Sie alles über die Iteratoren aus, 
        //und schreiben Sie jeweils den groeßten Messwert (fuer Elemente) bzw. die 
        //kuerzeste Einzelzeit (für Objekte, auf die Elemente verweisen) in die 
        //Standard-Ausgabe. Testen Sie Aenderungen aehnlich wie bei Punkt 1.
        
        OrderedMap<MeanElapsedTime,CompositeTime> om=new OrderedMap<MeanElapsedTime,CompositeTime>();
        
//        Das geht nicht (found Object). ist diese funktionalitaet erfordert??
//        while (!is.hasNext()) {
//            Description tmp = it.next();
//        }
    }
}
