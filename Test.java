

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
        System.out.println("Test von OrderedSet mit Description:");
        System.out.println("-----------------------------------");
        
        Description d1 = new Description("1");
        Description d2 = new Description("22");
        Description d3 = new Description("333");
        Description d4 = new Description("4444");
        Description d5 = new Description("55555");
        Description d6 = new Description("666666\n66");

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
            System.out.println(des.getLineCount()+" Zeilen: "+des);
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
            System.out.println(des.getLineCount()+" Zeilen: "+des);
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Test von OrderedSet mit CompositeTime:");
        System.out.println("-----------------------------------");
        
        CompositeTime t1 = new CompositeTime(new double[]{0.1});
        CompositeTime t2 = new CompositeTime(new double[]{0.5,0.2,0.3});        
        CompositeTime t3 = new CompositeTime(new double[]{3.0}); 
        CompositeTime t4 = new CompositeTime(new double[]{0.4,1.5,0.4,8.0,10.0}); 
        CompositeTime t5 = new CompositeTime(new double[]{50.0,100.0}); 
        
        OrderedSet<CompositeTime> tSet = new OrderedSet<CompositeTime>();
        
        tSet.insert(t1);
        tSet.insert(t2);
        tSet.insert(t3);
        tSet.insert(t4);
        tSet.insert(t5);
        
        Iterator<CompositeTime> im = tSet.iterator();
        while (im.hasNext()) {
            CompositeTime m = im.next();
            System.out.println(m.sum());
        }
        
        //2. Erzeugen Sie eine Instanz von OrderedMap, deren Elemente vom Typ 
        //MeanElapsedTime sind und die auf Objekte vom Typ CompositeTime verweisen - 
        //nicht sehr sinnvoll, aber gut zum Testen geeignet. Fuegen Sie einige Elemente 
        //und damit verbundene Objekte ein, lesen Sie alles ueber die Iteratoren aus, 
        //und schreiben Sie jeweils den groessten Messwert (fuer Elemente) bzw. die 
        //kuerzeste Einzelzeit (fuer Objekte, auf die Elemente verweisen) in die 
        //Standard-Ausgabe. Testen Sie Aenderungen aehnlich wie bei Punkt 1.
        
        System.out.println("-----------------------------------");
        System.out.println("Test von OrderedMap mit MeanElapsedTime/CompositeTime:");
        System.out.println("-----------------------------------");

        OrderedMap<MeanElapsedTime, CompositeTime> oMap = new OrderedMap<MeanElapsedTime, CompositeTime>();
        MeanElapsedTime mt1 = new MeanElapsedTime();
        mt1.add(0.55);
        mt1.add(23.5);
        mt1.add(10.0); 
        oMap.insert(mt1);
        MeanElapsedTime mt2 = new MeanElapsedTime();
        mt2.add(1.55);
        mt2.add(22.5);
        mt2.add(10.5);
        oMap.insert(mt2);
        MapIterator<MeanElapsedTime, CompositeTime> iom = oMap.iterator();
        Iterator<CompositeTime> iome=iom.iterator();
        //3 CompositeTime Elemente werden an die erste MeanElapsedTime angehaengt
        iome.add(t5);
        iome.add(t4);
        iome.add(t3);
        iom.next();
        iome=iom.iterator(); 
        //2 CompositeTime Elemente werden an die zweite MeanElapsedTime angehaengt   
        iome.add(t1);
        iome.add(t2);    
        
        iom = oMap.iterator();        
        //Ausgabe
        while (iom.hasNext()) {
            MeanElapsedTime et = iom.next();
            iome=iom.iterator();
            String ausg="";
            while(iome.hasNext()){
            ausg+="Shortest Time: "+iome.next().getShortestTime();
            }
            System.out.println("max: "+et.max()+ausg);
        }        


    }
}
