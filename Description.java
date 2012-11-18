
/**
 *
 * @author guetar
 */
public class Description implements Shorter<Description> {

    private String text;

    public Description(String text) {
        this.text = text;
    }

    @Override
    public boolean shorter(Description s) {
        return text.length() < s.toString().length();
    }

    @Override
    public String toString() {
        return text;
    }
}