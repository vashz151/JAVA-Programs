import java.util.*;
public class Rectangle
{
          public static void main(String args[])
          {
                   float length,breadth,area,perimeter;
                   Scanner sc=new Scanner(System.in);
                   length=sc.nextFloat();
                   breadth=sc.nextFloat();
                   perimeter=2*(length+breadth);
                   area=length*breadth;
                   System.out.println("Perimeter="+perimeter+"\nArea="+area); 
           }
}