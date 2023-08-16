import absolute_number_calculator.Absolute;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbsoluteTest {
    @Test
    void testFindAbsoluteZero() {
        int number = 0;
        int expected = 0;
        int result = Absolute.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolutePositive() {
        int number = 1;
        int expected = 1;
        int result = Absolute.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsoluteNegative() {
        int number = -1;
        int expected = 1;
        int result = Absolute.findAbsolute(number);
        assertEquals(expected,result);
    }
}