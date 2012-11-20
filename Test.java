

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
        
        System.out.println("-----------------------------------");
        System.out.println("Test of Set:");
        System.out.println("-----------------------------------");
        
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
        
        System.out.println("-----------------------------------");
        System.out.println("Test of OrderedSet mit Description:");
        System.out.println("-----------------------------------");
        
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
        
        Iterator<Description> id = oSet.iterator();
        while(id.hasNext()){
            Description des=id.next();
            System.out.println(des);
        }
        System.out.println("-----------------------------------");
        System.out.println("Entferne 1. und 4. Element:");
        System.out.println("-----------------------------------");
        
        id = oSet.iterator();
        //Entferne 1. und 4. Element
        id.remove();       
        id.next();
        id.next();
        id.remove();       

        //erneute Ausgabe
        id = oSet.iterator();
        while (id.hasNext()) {
            Description des = id.next();
            System.out.println(des);
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Test of OrderedSet mit ElapsedTime:");
        System.out.println("-----------------------------------");
        
        ElapsedTime t1 = new ElapsedTime();
        t1.setTime(10, 2, 40);
        ElapsedTime t2 = new ElapsedTime();
        t2.setTime(6, 4, 10);
        ElapsedTime t3 = new ElapsedTime();
        t3.setTime(8, 6, 20);
        ElapsedTime t4 = new ElapsedTime();
        t4.setTime(2, 4, 10);
        ElapsedTime t5 = new ElapsedTime();
        t5.setTime(4, 6, 20);
        
        OrderedSet<ElapsedTime> tSet = new OrderedSet<ElapsedTime>();
        
        tSet.insert(t1);
        tSet.insert(t2);
        tSet.insert(t3);
        tSet.insert(t4);
        tSet.insert(t5);
        
        Iterator<ElapsedTime> im = tSet.iterator();
        while (im.hasNext()) {
            ElapsedTime m = im.next();
            System.out.println(m);
        }
        
        //2. Erzeugen Sie eine Instanz von OrderedMap, deren Elemente vom Typ 
        //MeanElapsedTime sind und die auf Objekte vom Typ CompositeTime verweisen - 
        //nicht sehr sinnvoll, aber gut zum Testen geeignet. Fuegen Sie einige Elemente 
        //und damit verbundene Objekte ein, lesen Sie alles ueber die Iteratoren aus, 
        //und schreiben Sie jeweils den groessten Messwert (fuer Elemente) bzw. die 
        //kuerzeste Einzelzeit (fuer Objekte, auf die Elemente verweisen) in die 
        //Standard-Ausgabe. Testen Sie Aenderungen aehnlich wie bei Punkt 1.
        
        OrderedMap<ElapsedTime, ElapsedTime> oMap = new OrderedMap<ElapsedTime, ElapsedTime>();
        
        MeanElapsedTime m1 = new MeanElapsedTime();
        m1.add(20.45);
        m1.add(22.15);
        m1.add(24.00);
        
        MeanElapsedTime m2 = new MeanElapsedTime();
        m2.add(04.00);
        m2.add(06.30);
        m2.add(08.20);
        
        MeanElapsedTime m3 = new MeanElapsedTime();
        m3.add(02.30);
        m3.add(04.00);
        m3.add(06.20);
        
        double [] times1 = new double[3];
        times1[0] = 02.30;
        times1[1] = 03.30;
        times1[2] = 04.30;
        CompositeTime c1 = new CompositeTime(times1);
        
        double [] times2 = new double[3];
        times2[0] = 06.30;
        times2[1] = 07.30;
        times2[2] = 08.30;
        CompositeTime c2 = new CompositeTime(times2);
        
        double [] times3 = new double[3];
        times3[0] = 08.30;
        times3[1] = 09.30;
        times3[2] = 10.30;
        CompositeTime c3 = new CompositeTime(times3);
        
        oMap.insert(m1);
        oMap.insert(m2);
        oMap.insert(m3);
        oMap.insert(c1);
        oMap.insert(c2);
    }
}
