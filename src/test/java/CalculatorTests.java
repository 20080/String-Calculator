import main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTests {
    @Test
    public void shouldReturnZeroForEmptyString(){
        Assert.assertEquals(0, Calculator.add());
    }
}
