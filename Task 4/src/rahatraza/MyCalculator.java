/*
  Name    : Md. Rahat Miah Raza
  ID      : 2012020058
  Section : B
  email   : cse_2012020058@lus.ac.bd
  Date    : 16-10-2021

 */

package rahatraza;
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public void divisorSum(int n) {
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of the divisor for "+n+" is : "+sum);
    }

    @Override
    public void findFactorial(int n) {

        BigInteger factorial = BigInteger.ONE;

        for(int i=1; i<=n; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n+"! = "+factorial);
    }
}
