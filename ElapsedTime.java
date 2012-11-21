
/**
 *
 * @author guetar
 */
public abstract class ElapsedTime<S> implements Shorter<S> {

    private int time;


       
    public void setTime(int h, int m, int s) {
        time = h * 3600 + m * 60 + s;
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
    
    public abstract int count();
    
    @Override
    public String toString() {
        return getHour() + ":" + getMinutes() + ":" + getSeconds();
    }
}