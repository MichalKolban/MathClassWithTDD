package math;

public class Math {

    public static int mathMultiple(int[] numbers){
        int sumMulti = 1;
        for(int number : numbers){
            sumMulti = sumMulti * number;
        }
        return  sumMulti;
    }

    public static int mathMinValue(int[] numbers){
        int findMin = Integer.MAX_VALUE;

        for(int number : numbers){
            if(number < findMin )
                findMin = number;
        }
        return findMin;
    }

    public static  int mathMultipleWithNegativeNumbers(int[] negativeNumbers){
        int sumNegative = 1;
        for (int number : negativeNumbers){
            sumNegative *= number;
        }
        return sumNegative;
    }

    public static int mathMaxValue(int[] numbersMax){
        int findMax = Integer.MIN_VALUE;

        for(int number : numbersMax){
            if(number > findMax){
                findMax = number;

            }
        }
        return findMax;

    }
}
