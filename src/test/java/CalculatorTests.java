import main.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class CalculatorTests {
    private static int count;
    @Test
    public void shouldReturnZeroForEmptyString(){
        count++;
        Assert.assertEquals(0, Calculator.add(""));
    }

    @Test
    public void returnNumberForNumber(){
        count++;
        Assert.assertEquals(1,Calculator.add("1"));
    }

    @Test
    public void returnSumOfNumberSeparatedByCommas(){
        count++;
        Assert.assertEquals(6,Calculator.add("3,2,1"));
    }

    @Test
    public void acceptNewLineAsASeparator(){
        count++;
        Assert.assertEquals(6,Calculator.add("3,2\n1"));
    }

    @Test
    public void customSeparatorsSyntax(){
        count++;
        Assert.assertEquals(9,Calculator.add("//;\n2;6;1"));
    }

    @Test
    public void customSeparatorIsDOT(){
        count++;
        Assert.assertEquals(8,Calculator.add("//.\n2.6"));
    }

    @Test
    public void raiseExceptionOnNegativeNumbers(){
        count++;
        try{
            Calculator.add("-2,3,1");
            fail("Exception Expected");
        }
        catch (RuntimeException e){
    //todo
        }
    }

    @Test
    public void exceptionMessageShouldContainNegativeNumber(){
        count++;
        try{
            Calculator.add("-2,3");
            fail("Exception Expected");
        }
        catch (RuntimeException e){
            Assert.assertEquals("Negatives not allowed: -2 ",e.getMessage());
        }
    }

    @Test
    public void checkNumberOfCalls(){
        Assert.assertEquals(count,Calculator.GetCalledCount());
    }
}
