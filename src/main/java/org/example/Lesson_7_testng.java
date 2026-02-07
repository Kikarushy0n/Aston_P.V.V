package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson_7_testng {

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
    public void testFactorial() {
        Assert.assertEquals(factorial(5), 120);
    }

    @Test
    public void testArea() {
        Assert.assertEquals(triangleArea(10.0, 5.0), 25.0);
    }

    @Test
    public void testCalculate() {
        Assert.assertEquals(calculate(10, 5, "+"), 15);
    }

    @Test
    public void testCompare() {
        Assert.assertEquals(compare(10, 5), 1);
    }
}