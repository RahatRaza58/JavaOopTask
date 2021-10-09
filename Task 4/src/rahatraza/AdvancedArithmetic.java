package rahatraza;

import java.math.BigInteger;

public interface AdvancedArithmetic {

     default int divisiorSum(int n)
    {
        System.out.println("Divisior");

    }
     default int findFactorial(int n)
    {

            BigInteger result =BigInteger.ONE;
            for(int i=1;i<=n;i++)
            {
                result=result.multiply(BigInteger.valueOf(i));
                return result;
            }


    }
}
