package refactoring_rename;

public class Calculator {

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        final char ADDITION = '+';
        final char SUBTRACTION = '-';
        final char MULTIPLICATION = '*';
        final char DIVISION = '/';
        switch (operator) {
            case ADDITION -> {
                return firstOperand + secondOperand;
            }
            case SUBTRACTION -> {
                return firstOperand - secondOperand;
            }
            case MULTIPLICATION -> {
                return firstOperand * secondOperand;
            }
            case DIVISION -> {
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            }
            default -> throw new RuntimeException("Unsupported operation");
        }
    }
}
