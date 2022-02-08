import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator(1, 2, 3, 4, 5, 6, 7, 8, 9);}

    @Test
    public void canAdd(){

        assertEquals(11, calculator.addition());
    }

    @Test
    public void canSubtract(){

        assertEquals(4, calculator.subtraction());
    }

    @Test
    public void canMultiply(){

        assertEquals(36, calculator.multiply());
    }

    @Test
    public void canDivide(){

        assertEquals(5.5, calculator.divide(), 4.5);
    }
}
