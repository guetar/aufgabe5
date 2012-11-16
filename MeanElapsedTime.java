
/**
 *
 * @author guetar
 */
public class MeanElapsedTime<S extends MeanElapsedTime> extends ElapsedTime {
    
    private Set<Double> set;
    
    public boolean shorter(S s) {
        return (int) Math.round(avg()) < s.getTime();
    }
    
    public void add(double t) {
        set.add(t);
    }
    
    public int count() {
        return set.length;
    }
    
    public double max() {
        return 1.0;
    }
    
    public double avg() {
        return 1.0;
    }
}