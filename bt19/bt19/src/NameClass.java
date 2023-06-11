import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static final String Nameclass="^[ACP]+[0-9]+[GHIK]${6,}";

    public NameClass() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(Nameclass);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
