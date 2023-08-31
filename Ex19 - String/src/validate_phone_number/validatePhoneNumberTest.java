package validate_phone_number;

public class validatePhoneNumberTest {
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
    public static final String[] validNumber = new String[]{"(84)-(0978489648)"};
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        for (String c : validNumber) {
            boolean isValid = validatePhoneNumber.validate(c);
            System.out.println("Phone number is " + c + " is valid: " + isValid);
        }
        for (String c : invalidNumber) {
            boolean isValid = validatePhoneNumber.validate(c);
            System.out.println("Phone number is " + c + " is valid: " + isValid);
        }
    }
}
