import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Lesson_7_junit_5 {

    public int factorial(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) r *= i;
        return r;
    }

    public double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    public int calculate(int a, int b, String op) {
        if (op.equals("+")) return a + b;
        if (op.equals("-")) return a - b;
        if (op.equals("*")) return a * b;
        if (op.equals("/")) return a / b;
        return 0;
    }

    public int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    @Test
    void testAll() {
        assertEquals(120, factorial(5));
        assertEquals(10.0, triangleArea(5, 4));
        assertEquals(8, calculate(10, 2, "-"));
        assertEquals(1, compare(10, 5));
    }
}