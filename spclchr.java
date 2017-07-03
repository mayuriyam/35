import java.io.*;
import java.util.*;
class spclchr
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        String s1=sc.next();
        String s2=s1.replace("$","");
        int ss=(s1.length()-s2.length());
    System.out.println(ss);
        
    }
}
