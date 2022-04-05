
import java.util.*;
class Main
{
    static int x=10;
    static int y;
    static void fun(int z)
    {
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
    static
    {
        System.out.println("running static block");
        y=x+5;
    }
    public static void main(String[] args)
    {
        fun(8);
    }
}