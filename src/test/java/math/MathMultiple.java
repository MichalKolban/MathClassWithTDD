package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMultiple {


    @Test
    public void testMathMultiple(){

        //is
        int[] numbers = {2,5,5,3,4};

        //then
        int result = Math.mathMultiple(numbers);

        //excepted
        Assert.assertEquals(600,result);

    }


    @Test
    public void testMathMultipleWithNegativeNumbers(){

        //is
        int[] numbersNegative = {-1,-4,-3,2,6};

        //then
        int resultNegative = Math.mathMultipleWithNegativeNumbers(numbersNegative);

        //excepted
        Assert.assertEquals(-144,resultNegative);
    }
}
