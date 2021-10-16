/*
  Name    : Md. Rahat Miah Raza
  ID      : 2012020058
  Section : B
  email   : cse_2012020058@lus.ac.bd
  Date    : 16-10-2021

 */

package rahatraza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AdvancedArithmetic advancedArithmetic = new MyCalculator();

        System.out.print("\nEnter a number to find divisor of sum: ");
        int num1 = input.nextInt();
        advancedArithmetic.divisorSum(num1);

        System.out.print("\nEnter a number to find factorial: ");
        int num2 = input.nextInt();
        advancedArithmetic.findFactorial(num2);
    }
}