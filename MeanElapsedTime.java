
/**
 *
 * @author guetar
 */
public class MeanElapsedTime<S extends MeanElapsedTime> extends ElapsedTime {
    
    private Set<Double> set;
    
    public boolean shorter(S s) {
        return (int) Math.round(avg()) < (int) Math.round(s.avg());
    }
    
    public void add(double t) {
        set.insert(t);
    }
    
    public int count() {
        return set.length();
    }
    
    public double max() {
        return 1.0;
    }
    
    public double avg() {
        return 1.0;
    }
}