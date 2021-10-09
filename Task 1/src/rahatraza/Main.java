/* 
Name- Md.Rahat Miah Raza
ID-2012020058
Section-B
E-mail- cse_2012020058@lus.ac.bd
Date- 17 July 2021.
 */
package rahatraza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String section;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Section: ");
        section=input.nextLine();

        Info info= new Info(); //Object of Info class
        Hobby hobby= new Hobby(); //Object Of Hobby class


        System.out.printf("\nYour Section is: %s\n",section); //use of printf
        System.out.print("Name is : " +info.name); //use of print
        System.out.println("\nStudent ID is: "+info.id); //use of println
        System.out.println("Hobby is: "+hobby.hobbyName);


    }
}