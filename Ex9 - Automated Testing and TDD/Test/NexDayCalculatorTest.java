import calculator_next_day.NextDayCalculator;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

class NexDayCalculatorTest {
    @Test
    void testNextDay1() {
        NextDayCalculator toDay = new NextDayCalculator(1,1,2018);
        String nextDayExpected = "2 1 2018";
        String result = toDay.nextDay();
        assertEquals(nextDayExpected,result);
    }
    @Test
    void testNextDay2() {
        NextDayCalculator toDay = new NextDayCalculator(31,1,2018);
        String nextDayExpected = "1 2 2018";
        String result = toDay.nextDay();
        assertEquals(nextDayExpected,result);
    }
    @Test
    void testNextDay3() {
        NextDayCalculator toDay = new NextDayCalculator(30,4,2018);
        String nextDayExpected = "1 5 2018";
        String result = toDay.nextDay();
        assertEquals(nextDayExpected,result);
    }
    @Test
    void testNextDay4() {
        NextDayCalculator toDay = new NextDayCalculator(28,2,2018);
        String nextDayExpected = "1 3 2018";
        String result = toDay.nextDay();
        assertEquals(nextDayExpected,result);
    }
    @Test
    void testNextDay5() {
        NextDayCalculator toDay = new NextDayCalculator(29,2,2020);
        String nextDayExpected = "1 3 2020";
        String result = toDay.nextDay();
        assertEquals(nextDayExpected,result);
    }
    @Test
    void testNextDay6() {
        NextDayCalculator toDay = new NextDayCalculator(31,12,2018);
        String nextDayExpected = "1 1 2019";
        String result = toDay.nextDay();
        assertEquals(nextDayExpected,result);
    }
}