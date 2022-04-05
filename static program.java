import java.util.*;
class Main
{
    static int num;
    static String mystr;
    static 
    {
        System.out.println("block1");
        num=68;
        mystr="block1";
       
    }
    static
    {
        System.out.println("block2");
        num=98;
        mystr="block2";
    }
    public static void main(String[] args)
    {
       System.out.println("value of num"+num);
       System.out.println("value of mystr"+mystr);
    }
}

