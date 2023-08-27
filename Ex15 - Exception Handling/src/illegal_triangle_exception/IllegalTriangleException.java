package illegal_triangle_exception;

import java.util.InputMismatchException;

public class IllegalTriangleException extends InputMismatchException {
    @Override
    public String toString() {
        return "Không phải tam giác";
    }
}
