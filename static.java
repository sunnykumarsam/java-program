/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Main
{
    static String Name;
    static int Age;
    
    static void get()
    {
       
        Name="SUNNY KUMAR";
        Age=22;
    }
     static void display()
    {
        System.out.println("your name="+Name);
        System.out.println("your age= "+Age);
    }
   void fun()
   {
       get();
       display();
   }
    public static void main(String[] args)
    {
       Main obj=new Main();
       obj.fun();
    }
}
