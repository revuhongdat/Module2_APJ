package validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private static final String EMAIL_REGEX = "[a-zA-z0-9]+@[a-z]+\\.[c|o|m|v|n]{2,3}";
    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

