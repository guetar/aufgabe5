//
///**
// *
// * @author guetar
// */
public class MeanElapsedTime extends ElapsedTime<MeanElapsedTime> {

    private Set<Double> set;

    //NB: set!=null
    public MeanElapsedTime(){
    set=new Set<Double>();
    }
    
    //VB: s!=null
    //NB: return this.avg()<s.avg()
    @Override
    public boolean shorter(MeanElapsedTime s) {
        return avg() < s.avg();
    }

    //VB: t>=0
    //NB: set.count()++
    public void add(double t) {
        set.insert(t);
    }

    //NB: return count(set)
    public int count() {
        Iterator<Double> it = set.iterator();
        int count = 0;
        while (it.hasNext()) {
            count++;
            it.next();
        }
        return count;
    }

    //NB: return max(set)
    public double max() {
        Iterator<Double> it = set.iterator();
        double max = 0;
        while (it.hasNext()) {
            double cur = it.next();
            if (cur > max) {
                max = cur;
            }

        }
        return max;

    }

    //NB: return avg(set)
    public double avg() {
        Double sum = new Double(0);
        int count = 0;
        Iterator<Double> it = set.iterator();
        while (it.hasNext()) {
            count++;
            sum += it.next();
        }
        return sum / count;
    }
}