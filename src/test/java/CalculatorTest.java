import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalculatorCalc() {
        int n = Calculator.calc(1, 2, '-');
        assertEquals(n, 2);
    }

    @Test
    void testCalculatorOperation() {
        int n = Calculator.calc(2, 3,'+');
        assertEquals(n, 5);
    }
}
