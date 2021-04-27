import main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void shouldReturnZeroForEmptyString(){
        Assert.assertEquals(0, Calculator.add(""));
    }

    @Test
    public void returnNumberForNumber(){
        Assert.assertEquals(1,Calculator.add("1"));
    }
}
