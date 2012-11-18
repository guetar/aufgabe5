
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

    //NB: return linecount of text
    public int getLineCount() {
        String[] lines = text.split(String.valueOf(Character.LINE_SEPARATOR));
        return Math.max(1, lines.length);
    }

    @Override
    public String toString() {
        return text;
    }
}