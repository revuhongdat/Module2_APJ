import classification_triangle.TriangleClassifier;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void check1() {
        TriangleClassifier triangle = new TriangleClassifier(2,2,2);
        String expected = "Equilateral triangle";
        String result = triangle.classifier();
        assertEquals(expected, result);
    }
    @Test
    public void check2() {
        TriangleClassifier triangle = new TriangleClassifier(2,2,3);
        String expected = "Isosceles triangle";
        String result = triangle.classifier();
        assertEquals(expected, result);
    }
    @Test
    public void check3() {
        TriangleClassifier triangle = new TriangleClassifier(3,4,5);
        String expected = "Normal triangle";
        String result = triangle.classifier();
        assertEquals(expected, result);
    }
    @Test
    public void check4() {
        TriangleClassifier triangle = new TriangleClassifier(8,2,3);
        String expected = "Not a triangle";
        String result = triangle.classifier();
        assertEquals(expected, result);
    }
    @Test
    public void check5() {
        TriangleClassifier triangle = new TriangleClassifier(-1,2,1);
        String expected = "Not a triangle";
        String result = triangle.classifier();
        assertEquals(expected, result);
    }
    @Test
    public void check6() {
        TriangleClassifier triangle = new TriangleClassifier(0,1,1);
        String expected = "Not a triangle";
        String result = triangle.classifier();
        assertEquals(expected, result);
    }
}
