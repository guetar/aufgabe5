
/**
 *
 * @author guetar
 */
public class Description<S extends Description> extends Shorter<S> {

    private String text;

    public Description(String text) {
        this.text = text;
    }

    @Override
    public boolean shorter(S s) {
        return text.length() < s.toString().length();
    }

    @Override
    public String toString() {
        return text;
    }
}