package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMinValue {



    @Test
    public void testMathMinValue(){



        //is
        int[] numbers = {3,5,7,1,2,3};

        //then
        int minValue = Math.mathMinValue(numbers);

        //expected
        Assert.assertEquals(1,minValue);
    }

    @Test
    public void testMathMaxValue(){


        //is
        int[] numbersMax = {45,67,54,667,44,32,21,2};

        //then
        int maxValue = Math.mathMaxValue(numbersMax);

        //excepted
        Assert.assertEquals(667,maxValue);
    }
}
