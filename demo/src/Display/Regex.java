package Display;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    private static final String idRegex="^[\\d\\w]{6,12}$";
    private static final String passRegex= "^[\\d\\w]{6,12}$";
    private static final String nameRegex= "^[A-Za-z]{4,15}$";
    private static final String phoneRegex= "^[\\d\\w]{6,12}$";
    private static final String emailRegex= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public Regex() {
    }
    public boolean validateId(String id){
        Pattern pattern = Pattern.compile(idRegex);
        Matcher  matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public boolean validatePass(String pass){
        Pattern pattern = Pattern.compile(passRegex);
        Matcher  matcher = pattern.matcher(pass);
        return matcher.matches();
    }
    public boolean validateName(String name){
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher  matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public boolean validatePhone(String phone){
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher  matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher  matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
