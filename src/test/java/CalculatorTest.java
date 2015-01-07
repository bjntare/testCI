import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(1, 1), 2);
    }

    @Test
    public void shouldSubtractTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(calculator.subtract(1, 1), 0);
    }
}