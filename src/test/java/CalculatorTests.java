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

    @Test
    public void returnSumOfNumberSeparatedByCommas(){
        Assert.assertEquals(6,Calculator.add("3,2,1"));
    }

    @Test
    public void acceptNewLineAsASeparator(){
        Assert.assertEquals(6,Calculator.add("3,2\n1"));
    }
}
