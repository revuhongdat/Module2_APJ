import fizz_buzz.FizzBuzzTranslate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translateTest1() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(1);
        String expected = "one";
        String result = number.translate();
        assertEquals(expected,result);
    }
    @Test
    void translateTest2() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(3);
        String expected = "Fizz";
        String result = number.translate();
        assertEquals(expected,result);
    }
    @Test
    void translateTest3() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(5);
        String expected = "Buzz";
        String result = number.translate();
        assertEquals(expected,result);
    }
    @Test
    void translateTest4() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(13);
        String expected = "Fizz";
        String result = number.translate();
        assertEquals(expected,result);
    }
    @Test
    void translateTest5() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(15);
        String expected = "FizzBuzz";
        String result = number.translate();
        assertEquals(expected,result);
    }
    @Test
    void translateTest6() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(25);
        String expected = "Buzz";
        String result = number.translate();
        assertEquals(expected,result);
    }
    @Test
    void translateTest7() {
        FizzBuzzTranslate number = new FizzBuzzTranslate(44);
        String expected = "four four";
        String result = number.translate();
        assertEquals(expected,result);
    }
}