import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Main uncalculator;

    @Before
    public void setUp() {
        uncalculator = new Main();
    }

    @Test
    public void test_calculateSquareRoot() {
        double val = 16.0;
        double expectedResult = 4.0;
        double result = uncalculator.calculateSquareRoot(val);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_calculateFactorial() {
        int a = 5;
        int expectedResult = 120;
        int result = uncalculator.calculateFactorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_calculateNaturalLogarithm() {
        double a = 2.718;
        double expectedResult = 1.0;
        double result = uncalculator.calculateNaturalLogarithm(a);
        Assert.assertEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_calculatePowerFunction() {
        double a = 2.0;
        double b = 5.0;
        double expectedResult = 32.0;
        double result = uncalculator.calculatePowerFunction(a, b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
}
