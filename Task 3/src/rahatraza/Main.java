/*
Name- Md.Rahat Miah Raza
ID-2012020058
Section-B
E-mail- cse_2012020058@lus.ac.bd
Date- 10 September 2021.
*/
package rahatraza;

public class Main {

    public static void main(String[] args) {

        Player player=new Player("Shakib",75);
        Cricket cricket=new Cricket("International match",20,player);
        cricket.display();

        Football football=new Football();


    }
}
