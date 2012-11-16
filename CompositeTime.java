
/**
 *
 * @author guetar
 */
public class CompositeTime<S extends CompositeTime> extends ElapsedTime {
    
    private double[] times;
    
    public CompositeTime(double[] times) {
        this.times = times;
    }
    
    public boolean shorter(S s) {
        return sum() < s.sum();
    }
    
    public int count() {
        return times.length;
    }
    
    public double sum() {
        double s = 0;
        
        for(double t : times) {
            s += t;
        }
        return s;
    }
}