
/**
 *
 * @author guetar
 */
public class ElapsedTime<S extends ElapsedTime> implements Shorter<S> {

    private int time;
    
    public ElapsedTime(int h, int m, int s) {
        this.time = h * 3600 + m * 60 + s;
    }

    @Override
    public boolean shorter(S s) {
        return time < s.getTime();
    }

    public int getSeconds() {
        return time % 60;
    }

    public int getMinutes() {
        return (time / 60) % 60;
    }

    public int getHour() {
        return time / 3600;
    }
    
    public int getTime() {
        return time;
    }
    
    @Override
    public String toString() {
        return getHour() + ":" + getMinutes() + ":" + getSeconds();
    }
}