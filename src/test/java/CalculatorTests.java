import main.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

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

    @Test
    public void customSeparatorsSyntax(){
        Assert.assertEquals(9,Calculator.add("//;\n2;6;1"));
    }

    @Test
    public void customSeparatorIsDOT(){
        Assert.assertEquals(8,Calculator.add("//.\n2.6"));
    }

    @Test
    public void raiseExceptionOnNegativeNumbers(){
        try{
            Calculator.add("-2,3,1");
            fail("Exception Expected");
        }
        catch (RuntimeException e){
    //todo
        }
    }
}
