package validate_class;

public class ValidateClassTest {
    public static final String[] invalidClass = new String[]{"C0223G", "A0323K"};
    public static final String[] validClass = new String[]{"M0318G", "P0323A"};
    public static void main(String[] args) {
        ValidateClass validateClass = new ValidateClass();
        for (String c : validClass) {
            boolean isValid = validateClass.validate(c);
            System.out.println("Class is " + c + " is valid: " + isValid);
        }
        for (String c : invalidClass) {
            boolean isValid = validateClass.validate(c);
            System.out.println("Class is " + c + " is valid: " + isValid);
        }
    }
}
