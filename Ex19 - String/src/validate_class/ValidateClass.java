package validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_REGEX = "^(C|A|P)[0-9]{4}(G|H|I|K)$";

    ValidateClass() {}

    public boolean validate(String name) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
