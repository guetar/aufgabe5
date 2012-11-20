
/**
 *
 * @author guetar
 */
public class ElapsedTime implements Shorter<ElapsedTime> {

    private int time;

    @Override
    public boolean shorter(ElapsedTime s) {
        return time < s.getTime();
    }
    
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
    
    public int count() {
        return 1;
    }
    
    @Override
    public String toString() {
        return getHour() + ":" + getMinutes() + ":" + getSeconds();
    }
}