import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatePhone {
    private static final String regexPhone="^\\(\\d{2}\\)-\\([^0\\d{10}]\\)$";

    public ValidatePhone() {

    }
    public boolean validate(String a){
        Pattern p=Pattern.compile(regexPhone);
        Matcher m= p.matcher(a);
        return m.matches();
    }
}
