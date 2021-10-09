/*
Name- Md.Rahat Miah Raza
ID-2012020058
Section-B
E-mail- cse_2012020058@lus.ac.bd
Date- 09 August 2021.
*/
package rahatraza;

public class Student {
    String name;
    int id;
    static String universityName="Leading University";

    //Default Constructor
            Student()
            {
                System.out.println("Student Information-");
            }
    //Parameter Constructor
            Student(int id)
            {
                this.id=id;
            }

    //Constructor Overloading
            Student(int id,String name)
            {
                this.id = id;
                this.name= name;
                System.out.println("Student ID: "+id);
                System.out.println("Student Name: "+name);
            }

            void display()
            {
                System.out.println("University Name: "+universityName);
            }


}
