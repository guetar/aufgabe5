
/**
 *
 * @author guetar
 */
public class CompositeTime extends ElapsedTime {
    
    private double[] times;
    
    public CompositeTime(double[] times) {
        this.times = times;
    }
    
    public boolean shorter(CompositeTime s) {
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
    
    //NB: return min(times)
    public double getShortestTime() {
        double min = Double.MAX_VALUE;
        for (double time : times) {
            if(time<min)
                min=time;
        }
        return min;
    }
    
    @Override
    public String toString() {
        return "Shortest Time: " + getShortestTime();
    }
}